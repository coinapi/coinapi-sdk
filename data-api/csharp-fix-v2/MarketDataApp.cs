﻿using System;
using QuickFix;
using QuickFix.Fields;
using System.Collections.Generic;
using System.Threading;

namespace COINAPI.FIX.V2
{
    public class MarketDataApp : QuickFix.MessageCracker, QuickFix.IApplication
    {
        Session _session = null;

        private bool ExecuteSecurityListRequest = false;
        private string FilterBySymbolIdForSecurityListRequest = "^DERIBIT_OPT_(.*)$";
        private string FilterByExchangeNameForSecurityListRequest = "GEMINI";

        private string DebugSymbol = "COINBASE_SPOT_BTC_USD";

        private string[] SubscribeBySymbolRegex = new string[] 
        {
            //"^(.*)$"
            //"^GEMINI_SPOT_BTC_USD$", // you can use the exact match of the symbol id
            //"^GEMINI_SPOT_(.*)_ETH$", // or you can use the regular expression syntax to get eg. all spot symbols to ETH from GEMINI
            //"^GEMINI_SPOT_(BCH|LTC)_USD$" // second example of the regex, the BCH/USD & LTC/USD
            //"GEMINI_SPOT_ETH_BTC",
            //"BINANCEFTS_PERP_BNB_USDT",
            //"KRAKEN_SPOT_BTC_GBP",
            //"(.*)_SPOT_BTC_USD(.*)$",
            //"KRAKEN_SPOT_LTC_BTC",
            //"KRAKEN_SPOT_LTC_EUR",
            //"BINANCE_SPOT_USDC_TUSD",
            //"GEMINI_SPOT_ZEC_ETH",
            //"KRAKEN_SPOT_BTC_JPY",
            //"BITSTAMP_SPOT_BTC_EUR",
            //"BINANCE_SPOT_LTC_USDT",
            //"COINBASE_SPOT_BCH_EUR",
            //"BYBIT_PERP_ETH_USD",
            //"BINANCE_SPOT_LTC_TUSD",
            //"BITFINEX_SPOT_BTC_USDT",
            //"COINBASE_SPOT_BCH_BTC",
            //"COINBASE_SPOT_BTC_EUR",
            //"BITMEX_PERP_ETH_USD",
            //"BINANCEFTS_PERP_BTC_USDT",
            //"KRAKEN_SPOT_ETH_USD",
            //"BINANCE_SPOT_BTC_USDC",
            //"OKEX_PERP_BTC_USDT",
            //"KRAKEN_SPOT_ETH_EUR",
            //"BINANCE_SPOT_LTC_PAX",
            //"BITMEX_PERP_BTC_USD",
            //"BINANCE_SPOT_LTC_BTC",
            //"KRAKEN_SPOT_BTC_CAD",
            //"BINANCE_SPOT_BTC_TUSD",
            //"BINANCE_SPOT_TUSD_USDT",
            //"KRAKEN_SPOT_LTC_USD",
            //"BITSTAMP_SPOT_BTC_USD",
            //"COINBASE_SPOT_BCH_USD",
            //"BINANCEFTS_PERP_LTC_USDT",
            //"BINANCE_SPOT_ETH_USDT",
            //"BINANCE_SPOT_ETH_TUSD",
            //"COINBASE_SPOT_BTC_GBP",
            //"BINANCEFTS_PERP_BCH_USDT",
            //"GEMINI_SPOT_BTC_USD",
            //"GEMINI_SPOT_ETH_BTC",
            //"KRAKEN_SPOT_BTC_USD",
            //"KRAKEN_SPOT_ETH_JPY",
            //"KRAKEN_SPOT_USDT_USD",
            //"COINBASE_SPOT_ETH_BTC",
            //"COINBASE_SPOT_ETH_EUR",
            //"BITSTAMP_SPOT_LTC_USD",
            //"BITFINEX_SPOT_ETH_USDT",
            //"BITFINEX_SPOT_USDT_USD",
            //"COINBASE_SPOT_ETH_USD",
            //"GEMINI_SPOT_ZEC_USD",
            //"KRAKEN_SPOT_ETH_CAD",
            //"BINANCE_SPOT_LTC_USDC",
            //"BINANCEFTS_PERP_ETC_USDT",
            //"GEMINI_SPOT_ZEC_BTC",
            //"KRAKEN_SPOT_ETH_GBP",
            //"GEMINI_SPOT_ETH_USD",
            //"BITFINEX_SPOT_LTC_USD",
            //"KRAKEN_SPOT_BTC_EUR",
            //"BINANCE_SPOT_ETH_PAX",
            //"BINANCE_SPOT_BTC_PAX",
            //"COINBASE_SPOT_LTC_USD",
            //"BINANCE_SPOT_ETH_USDC",
            //"KRAKEN_SPOT_ETH_BTC",
            //"BINANCE_SPOT_ETH_BTC",
            //"BITFINEX_SPOT_BTC_USD",
            //"COINBASE_SPOT_LTC_EUR",
            //"BITFINEX_SPOT_ETH_USD",
            //"BYBIT_PERP_BTC_USD",
            "COINBASE_SPOT_BTC_USD",
            //"BITSTAMP_SPOT_ETH_USD",
            //"BITFINEX_SPOT_BTC_EUR",
            //"BINANCE_SPOT_BTC_USDT",
            //"OKEX_PERP_ETH_USDT",
            //"BINANCE_SPOT_BTC_USDS",
            //"BINANCE_SPOT_LTC_ETH"
            //"^(BITSTAMP|GEMINI|COINBASE)_SPOT_BTC_USD$"
        };

        private HashSet<string> _seen = null;

        #region IApplication interface overrides

        public void OnCreate(SessionID sessionID)
        {
            _session = Session.LookupSession(sessionID);
        }

        public void OnLogon(SessionID sessionID)
        {
            _seen = new HashSet<string>();

            Console.WriteLine("Logon - " + sessionID.ToString());

            if (ExecuteSecurityListRequest)
            {
                // get all the symbols
                SecurityListRequestAll();

                // get symbols only by the symbol prefix
                if (!string.IsNullOrWhiteSpace(FilterBySymbolIdForSecurityListRequest))
                {
                    SecurityListRequestFilteredBySymbolIdPrefix(FilterBySymbolIdForSecurityListRequest);
                }

                // get symbols from specific exchange
                if (!string.IsNullOrWhiteSpace(FilterByExchangeNameForSecurityListRequest))
                {
                    SecurityListRequestFilteredByExchange(FilterByExchangeNameForSecurityListRequest);
                }
            }

            // subscribe by symbol ids
            //MarketDataRequestTrades(SubscribeBySymbolRegex);
            //MarketDataRequestQuotes(SubscribeBySymbolRegex);
            //MarketDataRequestFullOrderbook(SubscribeBySymbolRegex);
            MarketDataRequestFullOrderbookIncrementialMsgPerEach(SubscribeBySymbolRegex);
        }

        private void MarketDataRequestTrades(string[] symbol_ids)
        {
            QuickFix.FIX44.MarketDataRequest mdr = new QuickFix.FIX44.MarketDataRequest();
            mdr.MDReqID = new MDReqID(Guid.NewGuid().ToString());
            mdr.SubscriptionRequestType = new SubscriptionRequestType(SubscriptionRequestType.SNAPSHOT_PLUS_UPDATES);
            mdr.MarketDepth = new MarketDepth(0);

            var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
            type.MDEntryType = new MDEntryType(MDEntryType.TRADE);
            mdr.AddGroup(type);

            foreach (var symbol_id in symbol_ids)
            {
                var relatedsym = new QuickFix.FIX44.MarketDataRequest.NoRelatedSymGroup();
                relatedsym.Symbol = new Symbol(symbol_id);
                mdr.AddGroup(relatedsym);
            }

            SendMessage(mdr);
        }

        private void MarketDataRequestQuotes(string[] symbol_ids)
        {
            QuickFix.FIX44.MarketDataRequest mdr = new QuickFix.FIX44.MarketDataRequest();
            mdr.MDReqID = new MDReqID(Guid.NewGuid().ToString());
            mdr.SubscriptionRequestType = new SubscriptionRequestType(SubscriptionRequestType.SNAPSHOT_PLUS_UPDATES);
            mdr.MarketDepth = new MarketDepth(1);
            mdr.MDUpdateType = new MDUpdateType(MDUpdateType.FULL_REFRESH);

            {
                var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                type.MDEntryType = new MDEntryType(MDEntryType.BID);
                mdr.AddGroup(type);
            }
            {
                var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                type.MDEntryType = new MDEntryType(MDEntryType.OFFER);
                mdr.AddGroup(type);
            }

            foreach (var symbol_id in symbol_ids)
            {
                var relatedsym = new QuickFix.FIX44.MarketDataRequest.NoRelatedSymGroup();
                relatedsym.Symbol = new Symbol(symbol_id);
                mdr.AddGroup(relatedsym);
            }

            SendMessage(mdr);
        }

        private void MarketDataRequestFullOrderbook(string[] symbol_ids)
        {
            QuickFix.FIX44.MarketDataRequest mdr = new QuickFix.FIX44.MarketDataRequest();
            mdr.MDReqID = new MDReqID(Guid.NewGuid().ToString());
            mdr.SubscriptionRequestType = new SubscriptionRequestType(SubscriptionRequestType.SNAPSHOT_PLUS_UPDATES);
            mdr.MarketDepth = new MarketDepth(20);
            mdr.MDUpdateType = new MDUpdateType(MDUpdateType.FULL_REFRESH);

            {
                var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                type.MDEntryType = new MDEntryType(MDEntryType.BID);
                mdr.AddGroup(type);
            }
            {
                var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                type.MDEntryType = new MDEntryType(MDEntryType.OFFER);
                mdr.AddGroup(type);
            }

            foreach (var symbol_id in symbol_ids)
            {
                var relatedsym = new QuickFix.FIX44.MarketDataRequest.NoRelatedSymGroup();
                relatedsym.Symbol = new Symbol(symbol_id);
                mdr.AddGroup(relatedsym);
            }

            SendMessage(mdr);
        }

        private void MarketDataRequestFullOrderbookIncrementialAllInOne(string[] symbol_ids)
        {
            //Console.WriteLine($"Sending MarketDataRequest with {symbol_ids.Length} items.");
            QuickFix.FIX44.MarketDataRequest mdr = new QuickFix.FIX44.MarketDataRequest();
            mdr.MDReqID = new MDReqID(Guid.NewGuid().ToString());
            mdr.SubscriptionRequestType = new SubscriptionRequestType(SubscriptionRequestType.SNAPSHOT_PLUS_UPDATES);
            mdr.MarketDepth = new MarketDepth(0);
            mdr.MDUpdateType = new MDUpdateType(MDUpdateType.INCREMENTAL_REFRESH);

            {
                var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                type.MDEntryType = new MDEntryType(MDEntryType.BID);
                mdr.AddGroup(type);
            }
            {
                var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                type.MDEntryType = new MDEntryType(MDEntryType.OFFER);
                mdr.AddGroup(type);
            }

            foreach (var symbol_id in symbol_ids)
            {
                var relatedsym = new QuickFix.FIX44.MarketDataRequest.NoRelatedSymGroup();
                relatedsym.Symbol = new Symbol(symbol_id);
                mdr.AddGroup(relatedsym);
            }

            SendMessage(mdr);
        }

        private void MarketDataRequestFullOrderbookIncrementialMsgPerEach(string[] symbol_ids)
        {
            foreach (var symbol_id in symbol_ids)
            {
                //Console.WriteLine($"Sending MarketDataRequest with {symbol_ids.Length} items.");
                QuickFix.FIX44.MarketDataRequest mdr = new QuickFix.FIX44.MarketDataRequest();
                mdr.MDReqID = new MDReqID(Guid.NewGuid().ToString());
                mdr.SubscriptionRequestType = new SubscriptionRequestType(SubscriptionRequestType.SNAPSHOT_PLUS_UPDATES);
                mdr.MarketDepth = new MarketDepth(0);
                mdr.MDUpdateType = new MDUpdateType(MDUpdateType.INCREMENTAL_REFRESH);

                {
                    var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                    type.MDEntryType = new MDEntryType(MDEntryType.BID);
                    mdr.AddGroup(type);
                }
                {
                    var type = new QuickFix.FIX44.MarketDataRequest.NoMDEntryTypesGroup();
                    type.MDEntryType = new MDEntryType(MDEntryType.OFFER);
                    mdr.AddGroup(type);
                }

                var relatedsym = new QuickFix.FIX44.MarketDataRequest.NoRelatedSymGroup();
                relatedsym.Symbol = new Symbol(symbol_id);
                mdr.AddGroup(relatedsym);

                SendMessage(mdr);
            }
        }

        private void SecurityListRequestFilteredBySymbolIdPrefix(string symbol_id_prefix)
        {
            QuickFix.FIX44.SecurityListRequest slr =
                new QuickFix.FIX44.SecurityListRequest(
                    new SecurityReqID(Guid.NewGuid().ToString()),
                    new SecurityListRequestType(SecurityListRequestType.SYMBOL));
            slr.Symbol = new Symbol(symbol_id_prefix);
            SendMessage(slr);
        }

        private void SecurityListRequestFilteredByExchange(string exchange)
        {
            QuickFix.FIX44.SecurityListRequest slr =
                new QuickFix.FIX44.SecurityListRequest(
                    new SecurityReqID(Guid.NewGuid().ToString()),
                    new SecurityListRequestType(SecurityListRequestType.SYMBOL));
            slr.SecurityExchange = new SecurityExchange(exchange);
            SendMessage(slr);
        }

        private void SecurityListRequestAll()
        {
            QuickFix.FIX44.SecurityListRequest slr =
                new QuickFix.FIX44.SecurityListRequest(
                    new SecurityReqID(Guid.NewGuid().ToString()),
                    new SecurityListRequestType(SecurityListRequestType.ALL_SECURITIES));
            SendMessage(slr);
        }

        public void OnLogout(SessionID sessionID)
        {
            Console.WriteLine("Logout - " + sessionID.ToString());
        }

        public void FromAdmin(Message message, SessionID sessionID)
        {
            Console.WriteLine("FromAdmin - " + sessionID.ToString() + " - " + message.ToString());
        }
        public void ToAdmin(Message message, SessionID sessionID)
        {
            Console.WriteLine("ToAdmin - " + sessionID.ToString() + " - " + message.ToString());
        }

        public void FromApp(Message message, SessionID sessionID)
        {
            //Console.WriteLine("IN:  " + message.ToString());
            try
            {
                Crack(message, sessionID);
            }
            catch (Exception ex)
            {
                Console.WriteLine("==Cracker exception==");
                Console.WriteLine(ex.ToString());
                Console.WriteLine(ex.StackTrace);
            }
        }

        public void ToApp(Message message, SessionID sessionID)
        {
            //Console.WriteLine("OUT: " + message.ToString());
        }
        #endregion

        public void OnMessage(QuickFix.FIX44.SecurityList msg, SessionID s)
        {
            string text = $"Received SecurityList with id = {msg.SecurityReqID.getValue()}, type {msg.SecurityRequestResult.getValue()}";
            if (msg.IsSetTotNoRelatedSym())
            {
                text += $", TotNoRelatedSym = {msg.TotNoRelatedSym.getValue()}, LastFragment = {msg.LastFragment.getValue()}, NoRelatedSym = {msg.NoRelatedSym.getValue()}";
            }
            Console.WriteLine(text);
            return;

            for (int idx = 0; idx < msg.NoRelatedSym.getValue(); idx++)
            {
                var symbol = new QuickFix.FIX44.SecurityList.NoRelatedSymGroup();
                msg.GetGroup(idx + 1, symbol);

                Console.WriteLine($"Received symbol {symbol.Symbol} @ {symbol.SecurityExchange}");
            }
            Console.WriteLine($"--------------------------------------------------");
        }

        public void OnMessage(QuickFix.FIX44.MarketDataIncrementalRefresh msg, SessionID s)
        {
            var symbols = new HashSet<string>();
            var entryType = new HashSet<string>();

            for (int idx = 0; idx < msg.NoMDEntries.getValue(); idx++)
            {
                var item = new QuickFix.FIX44.MarketDataIncrementalRefresh.NoMDEntriesGroup();
                msg.GetGroup(idx + 1, item);
                symbols.Add(item.Symbol.getValue());
                if (MDEntryType.BID == item.MDEntryType.getValue())
                {
                    entryType.Add("BID");
                }
                else if (MDEntryType.OFFER == item.MDEntryType.getValue())
                {
                    entryType.Add("OFFER");
                }
                else if (MDEntryType.TRADE == item.MDEntryType.getValue())
                {
                    entryType.Add("TRADE");
                }

                if (!_seen.Contains(item.Symbol.getValue()) && MDEntryType.TRADE != item.MDEntryType.getValue())
                {
                    //throw new Exception("Incremential before snapshot");
                }
            }

            for (int idx = 0; idx < msg.NoMDEntries.getValue(); idx++)
            {
                var item = new QuickFix.FIX44.MarketDataIncrementalRefresh.NoMDEntriesGroup();
                msg.GetGroup(idx + 1, item);

                if (item.Symbol.getValue() == DebugSymbol)
                {
                    Console.WriteLine($"Received MarketDataIncrementalRefresh {msg.NoMDEntries.getValue()} items for {string.Join(",", symbols)} with {string.Join(",", entryType)} (lag: {(DateTime.UtcNow - msg.Header.GetDateTime(52)).TotalMilliseconds} / {(DateTime.UtcNow - item.MDEntryDate.getValue().Add(item.MDEntryTime.getValue().TimeOfDay)).TotalMilliseconds}).");
                }
                return;

                Console.WriteLine($"{item.MDEntryType} {item.MDUpdateAction} @ {item.Symbol}:");
                if (item.IsSetMDEntryID())
                {
                    Console.WriteLine($" ID: {item.MDEntryID}");
                }
                Console.WriteLine($" Date: {item.MDEntryDate}");
                Console.WriteLine($" Time: {item.MDEntryTime}");
                Console.WriteLine($" Px: {item.MDEntryPx}");
                Console.WriteLine($" Size: {item.MDEntrySize}");
                if (item.IsSetMDEntryOriginator())
                {
                    Console.WriteLine($" TakerSide: {item.MDEntryOriginator}");
                }
            }
            Console.WriteLine($"--------------------------------------------------");
        }

        public void OnMessage(QuickFix.FIX44.MarketDataSnapshotFullRefresh msg, SessionID s)
        {
            _seen.Add(msg.Symbol.getValue());

            if (msg.Symbol.getValue() == DebugSymbol)
            {
                for (int idx = 0; idx < msg.NoMDEntries.getValue(); idx++)
                {
                    var item = new QuickFix.FIX44.MarketDataSnapshotFullRefresh.NoMDEntriesGroup();
                    msg.GetGroup(idx + 1, item);
                    Console.WriteLine($"Received MarketDataSnapshotFullRefresh for {msg.Symbol.getValue()} with {msg.NoMDEntries.getValue()} items (lag: {(DateTime.UtcNow - msg.Header.GetDateTime(52)).TotalMilliseconds} / {(DateTime.UtcNow - item.MDEntryDate.getValue().Add(item.MDEntryTime.getValue().TimeOfDay)).TotalMilliseconds}).");
                    break;
                }
            }
            return;
            //for (int idx = 0; idx < msg.NoMDEntries.getValue(); idx++)
            //{
            //    var level = new QuickFix.FIX44.MarketDataSnapshotFullRefresh.NoMDEntriesGroup();
            //    msg.GetGroup(idx + 1, level);
            //    Console.WriteLine($"{level.MDEntryType} @ {msg.Symbol}:");
            //    Console.WriteLine($" Date: {level.MDEntryDate}");
            //    Console.WriteLine($" Time: {level.MDEntryTime}");
            //    Console.WriteLine($" Px: {level.MDEntryPx}");
            //    Console.WriteLine($" Size: {level.MDEntrySize}");
            //}

            Console.WriteLine("BIDS:");
            for (int idx = 0; idx < msg.NoMDEntries.getValue(); idx++)
            {
                var level = new QuickFix.FIX44.MarketDataSnapshotFullRefresh.NoMDEntriesGroup();
                msg.GetGroup(idx + 1, level);
                if (level.MDEntryType.getValue() == MDEntryType.OFFER)
                {
                    continue;
                }
                Console.WriteLine($"P {level.MDEntryPx} @ S {level.MDEntrySize}");
            }

            Console.WriteLine("ASKS:");
            for (int idx = 0; idx < msg.NoMDEntries.getValue(); idx++)
            {
                var level = new QuickFix.FIX44.MarketDataSnapshotFullRefresh.NoMDEntriesGroup();
                msg.GetGroup(idx + 1, level);
                if (level.MDEntryType.getValue() == MDEntryType.BID)
                {
                    continue;
                }
                Console.WriteLine($"P {level.MDEntryPx} @ S {level.MDEntrySize}");
            }
        }

        private void SendMessage(Message m)
        {
            if (_session != null)
            {
                _session.Send(m);
            }
            else
            {
                // This probably won't ever happen.
                Console.WriteLine("Can't send message: session not created.");
            }
        }
    }
}
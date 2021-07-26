// Copyright (c) 2021. Marvin Friedrich Lars Hansen. All Rights Reserved. Contact: marvin.hansen@gmail.com

package types

type OemlMessage struct {
	BalanceSnapshot              *Balance
	BalanceUpdate                *Balance
	MessageType                  *MessageType
	OrderExecutionReportSnapshot *OrderExecutionReport
	OrderExecutionReportUpdate   *OrderExecutionReport
	PositionSnapshot             *Position
	PositionUpdate               *Position
	ServerInfo                   *ServerInfo
	SymbolSnapshot               *Symbols
	Message                      *Message
}

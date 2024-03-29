% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/Orderbook.R
\name{getLatestOrderbook}
\alias{getLatestOrderbook}
\title{Get latest order book snapshots for a specific symbol, returned in time descending order.}
\usage{
getLatestOrderbook(symbol, limitLevels = 0, limit = 100)
}
\arguments{
\item{limit}{}
}
\value{

}
\description{
Get latest order book snapshots for a specific symbol, returned in time descending order.
}
\examples{
getLatestOrderbook(symbol = "BITSTAMP_SPOT_BTC_USD", limitLevels = 1, limit = 25)
}

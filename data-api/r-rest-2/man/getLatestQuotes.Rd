% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/Quotes.R
\name{getLatestQuotes}
\alias{getLatestQuotes}
\title{Get latest quote updates up to 1 minute ago or get updates for a specific symbol without time limit.
Latest data is always returned in time descending order.}
\usage{
getLatestQuotes(symbol = NULL, filterSymbol = NULL, limit = 100)
}
\arguments{
\item{limit}{}
}
\value{

}
\description{
Get latest quote updates up to 1 minute ago or get updates for a specific symbol without time limit.
Latest data is always returned in time descending order.
}
\examples{
getLatestQuotes()
getLatestQuotes(symbol = "BITSTAMP_SPOT_BTC_USD")
getLatestQuotes(filterSymbol = "BTC")
}

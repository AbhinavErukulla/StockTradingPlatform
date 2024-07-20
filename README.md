
This is a simulated stock trading platform implemented in Java. It allows users to perform basic stock trading operations such as buying and selling stocks, as well as viewing their portfolio performance.

## Features

- Simulate market data for a set of predefined stocks.
- Buy and sell stocks.
- Track portfolio performance.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).

### Project Structure

StockTradingPlatform
├── src
│ ├── Stock.java
│ ├── Trade.java
│ ├── Portfolio.java
│ ├── MarketService.java
│ ├── TradeService.java
│ ├── PortfolioService.java
│ └── StockTradingApp.java
└── build


### Installation

1. Clone the repository or download the source code.

     sh
git clone https://github.com/AbhinavErukulla/StockTradingPlatform.git

Navigate to the project directory.

	  cd StockTradingPlatform

Compilation

	javac -d build src/*.java

Running the Application
 
	java -cp build StockTradingApp

Example Stocks

The application uses the following predefined stocks:

Symbol	Name			Estimated Price
AAPL	Apple Inc.		$150.00
MSFT	Microsoft Corporation	$280.00
GOOGL	Alphabet Inc.		$2700.00
AMZN	Amazon.com, Inc.	$3400.00
TSLA	Tesla, Inc.		$700.00
FB	Meta Platforms, Inc.	$350.00
NFLX	Netflix, Inc.		$550.00
NVDA	NVIDIA Corporation	$200.00
JPM	JPMorgan Chase & Co.	$160.00
V	Visa Inc.		$230.00


Usage

Upon running the application, you will see a menu with the following options:

1. Buy Stock
2. Sell Stock
3. View Portfolio
4. Exit

-->Buy Stock: Enter the stock symbol and quantity to buy.
-->Sell Stock: Enter the stock symbol and quantity to sell.
-->View Portfolio: View the current portfolio with the total value and individual stock details.
-->Exit: Exit the application.


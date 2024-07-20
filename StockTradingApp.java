import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockTradingApp {

    private static Map<String, Stock> availableStocks;

    public static void main(String[] args) {
        initializeStocks();

        MarketService marketService = new MarketService();
        Portfolio portfolio = new Portfolio();
        TradeService tradeService = new TradeService(marketService, portfolio);
        PortfolioService portfolioService = new PortfolioService(portfolio);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    buyStock(scanner, tradeService);
                    break;
                case 2:
                    sellStock(scanner, tradeService);
                    break;
                case 3:
                    viewPortfolio(portfolioService, portfolio);
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    private static void initializeStocks() {
        availableStocks = new HashMap<>();
        availableStocks.put("AAPL", new Stock("AAPL", "Apple Inc.", 150.00));
        availableStocks.put("MSFT", new Stock("MSFT", "Microsoft Corporation", 280.00));
        availableStocks.put("GOOGL", new Stock("GOOGL", "Alphabet Inc.", 2700.00));
        availableStocks.put("AMZN", new Stock("AMZN", "Amazon.com, Inc.", 3400.00));
        availableStocks.put("TSLA", new Stock("TSLA", "Tesla, Inc.", 700.00));
        availableStocks.put("FB", new Stock("FB", "Meta Platforms, Inc.", 350.00));
        availableStocks.put("NFLX", new Stock("NFLX", "Netflix, Inc.", 550.00));
        availableStocks.put("NVDA", new Stock("NVDA", "NVIDIA Corporation", 200.00));
        availableStocks.put("JPM", new Stock("JPM", "JPMorgan Chase & Co.", 160.00));
        availableStocks.put("V", new Stock("V", "Visa Inc.", 230.00));
    }

    private static void buyStock(Scanner scanner, TradeService tradeService) {
        System.out.print("Enter stock symbol: ");
        String buySymbol = scanner.next();
        if (availableStocks.containsKey(buySymbol)) {
            Stock buyStock = availableStocks.get(buySymbol);
            System.out.print("Enter quantity: ");
            int buyQuantity = scanner.nextInt();
            tradeService.buyStock(buyStock, buyQuantity);
        } else {
            System.out.println("Invalid stock symbol.");
        }
    }

    private static void sellStock(Scanner scanner, TradeService tradeService) {
        System.out.print("Enter stock symbol: ");
        String sellSymbol = scanner.next();
        if (availableStocks.containsKey(sellSymbol)) {
            Stock sellStock = availableStocks.get(sellSymbol);
            System.out.print("Enter quantity: ");
            int sellQuantity = scanner.nextInt();
            tradeService.sellStock(sellStock, sellQuantity);
        } else {
            System.out.println("Invalid stock symbol.");
        }
    }

    private static void viewPortfolio(PortfolioService portfolioService, Portfolio portfolio) {
        System.out.println("Portfolio Value: " + portfolioService.getPortfolioValue());
        portfolio.getStocks().forEach((stock, quantity) -> {
            System.out.println(stock.getName() + " (" + stock.getSymbol() + "): " + quantity + " shares at $" + stock.getPrice());
        });
    }
}

// TradeService.java
public class TradeService {
    private MarketService marketService;
    private Portfolio portfolio;

    public TradeService(MarketService marketService, Portfolio portfolio) {
        this.marketService = marketService;
        this.portfolio = portfolio;
    }

    public void buyStock(Stock stock, int quantity) {
        double price = marketService.getStockPrice(stock);
        stock.setPrice(price);
        portfolio.addStock(stock, quantity);
    }

    public void sellStock(Stock stock, int quantity) {
        double price = marketService.getStockPrice(stock);
        stock.setPrice(price);
        portfolio.removeStock(stock, quantity);
    }
}

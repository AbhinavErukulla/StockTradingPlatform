// MarketService.java
import java.util.Random;

public class MarketService {
    private Random random;

    public MarketService() {
        this.random = new Random();
    }

    public double getStockPrice(Stock stock) {
        // Simulate market price changes
        return stock.getPrice() * (0.95 + (0.1 * random.nextDouble()));
    }
}




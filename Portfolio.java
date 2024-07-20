// Portfolio.java
import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<Stock, Integer> stocks;

    public Portfolio() {
        this.stocks = new HashMap<>();
    }

    public void addStock(Stock stock, int quantity) {
        this.stocks.put(stock, this.stocks.getOrDefault(stock, 0) + quantity);
    }

    public void removeStock(Stock stock, int quantity) {
        if (this.stocks.containsKey(stock)) {
            int currentQuantity = this.stocks.get(stock);
            if (currentQuantity > quantity) {
                this.stocks.put(stock, currentQuantity - quantity);
            } else {
                this.stocks.remove(stock);
            }
        }
    }

    public Map<Stock, Integer> getStocks() {
        return stocks;
    }

    public double getTotalValue() {
        double total = 0.0;
        for (Map.Entry<Stock, Integer> entry : stocks.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}

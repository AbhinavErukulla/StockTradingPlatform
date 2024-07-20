// Trade.java
public class Trade {
    public enum TradeType { BUY, SELL }

    private Stock stock;
    private int quantity;
    private TradeType tradeType;

    public Trade(Stock stock, int quantity, TradeType tradeType) {
        this.stock = stock;
        this.quantity = quantity;
        this.tradeType = tradeType;
    }

    // Getters and Setters
    public Stock getStock() { return stock; }
    public void setStock(Stock stock) { this.stock = stock; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public TradeType getTradeType() { return tradeType; }
    public void setTradeType(TradeType tradeType) { this.tradeType = tradeType; }
}

// PortfolioService.java
public class PortfolioService {
    private Portfolio portfolio;

    public PortfolioService(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public double getPortfolioValue() {
        return portfolio.getTotalValue();
    }
}
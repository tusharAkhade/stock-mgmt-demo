package StockModel;

/**
 * Setting and getting company name, number of shares and share price.
 */
public class Stock {
    String companyName;
    long numberOfShares;
    double sharePrice;

    // creating no-args constructor because at the time of Object creation of "Stock" it will call the no-args constructor
    public Stock() {
    }

    public Stock(String companyName, long numberOfShares, double sharePrice) {
        this.companyName = companyName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(long numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
}

package StockService;

import StockModel.Stock;

import java.util.ArrayList;

/**
 * Created Interface for abstract methods
 */
public interface StockServiceInterface {
    public abstract ArrayList<Stock> addStock(Stock stock, ArrayList<Stock> StockList);
    public abstract ArrayList<Stock> editStock(ArrayList<Stock> StockList);
    public abstract ArrayList<Stock> deleteStock(ArrayList<Stock> StockList);
    public abstract ArrayList<Stock> viewStock(ArrayList<Stock> StockList);
}

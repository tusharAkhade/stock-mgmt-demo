package StockService;

import StockModel.Stock;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Implementing or defining abstract methods by overriding the method.
 */
public class StockService implements StockServiceInterface {
    Scanner scanner = new Scanner(System.in);

    //It will add the stock to the StockList
    @Override
    public ArrayList<Stock> addStock(Stock stock, ArrayList<Stock> StockList) {
        System.out.print("Enter company name: ");
        String cName = scanner.next();
        System.out.print("Enter Number of Shares: ");
        long shareNum = scanner.nextLong();
        System.out.print("Enter share price: ");
        double sharePrice = scanner.nextDouble();

        stock.setCompanyName(cName);
        stock.setNumberOfShares(shareNum);
        stock.setSharePrice(sharePrice);

        StockList.add(stock);
        return null;
    }

    // Editing the stock number and stock price
    @Override
    public ArrayList<Stock> editStock(ArrayList<Stock> StockList) {
        System.out.println("Enter company name: ");
        String name = scanner.next();
        for (int i = 0; i < StockList.size(); i++ ) {
            if (StockList.get(i).getCompanyName().equals(name)) {
                System.out.print("Enter Number of Shares: ");
                long newShareNum = scanner.nextLong();
                System.out.print("Enter share price: ");
                double newSharePrice = scanner.nextDouble();

                StockList.get(i).setNumberOfShares(newShareNum);
                StockList.get(i).setSharePrice(newSharePrice);

                break;
            }
        }
        return null;
    }

    // deleting the listed stock of the company
    @Override
    public ArrayList<Stock> deleteStock(ArrayList<Stock> StockList) {
        System.out.print("Enter a company name:");
        String deleteCompany = scanner.next();
        for (int i = 0; i < StockList.size(); i++) {
            if (StockList.get(i).getCompanyName().equals(deleteCompany)) {
                StockList.remove(i);
            }
        }
        return null;
    }

    // Reading the stocks
    @Override
    public ArrayList<Stock> viewStock(ArrayList<Stock> StockList) {
        for (Stock s: StockList) {
            System.out.println(s.getCompanyName() + " " + s.getNumberOfShares() + " " + s.getSharePrice());
        }
        return null;
    }
}

package StockController;
import StockModel.Stock;
import StockService.StockService;
import StockService.StockServiceInterface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class to read Stock name, Number of share and price of share from user.
 * And perform CRED operation.
 * @author Tushar Akhade
 * @since 19 Jun 2021
 */
public class StockMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StockServiceInterface stockServiceInterface = new StockService();

        ArrayList<Stock> StockList = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            System.out.println("1 - Add stock\n2 - View\n3 - Edit\n4 - Delete\n5 - Exit");
            int choice = scanner.nextInt();
            Stock stock = new Stock();

            switch (choice) {
                case 1:
                    stockServiceInterface.addStock(stock, StockList);
                    break;
                case 2:
                    stockServiceInterface.viewStock(StockList);
                    break;
                case 3:
                    stockServiceInterface.editStock(StockList);
                    break;
                case 4:
                    stockServiceInterface.deleteStock(StockList);
                    break;
                default:
                    flag = false;
            }
        }
    }
}

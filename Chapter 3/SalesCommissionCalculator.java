import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sales, totalSales = 0;

        System.out.print("Enter sales amount for an item (-1 to quit): ");
        sales = input.nextDouble();

        while (sales != -1) {
            totalSales += sales;

            System.out.print("Enter next sales amount (-1 to quit): ");
            sales = input.nextDouble();
        }

        double earnings = 200 + 0.09 * totalSales;
        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Earnings: $%.2f%n", earnings);
    }
}

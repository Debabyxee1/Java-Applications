import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (or -1 to quit): ");
            int account = input.nextInt();
            if (account == -1) break;

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits: ");
            int credits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + charges - credits;

            System.out.printf("New balance for account %d is %d%n", account, newBalance);

            if (newBalance > creditLimit)
                System.out.println("Credit limit exceeded!\n");
            else
                System.out.println("Within credit limit.\n");
        }
    }
}

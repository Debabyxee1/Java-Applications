import java.util.Scanner;

public class ElectricityBillingSystem {

    public enum CustomerType {
        REGULAR,
        BUSINESS,
        VIP
    }

    public static double calculateBill(int units, CustomerType type) {
        double totalBill = 0;
        int remainingUnits = units;

        System.out.println("\n--- Bill Breakdown ---");
        while (remainingUnits > 0) {
            int blockUnits = Math.min(remainingUnits, 50);
            double rate;

            if (units <= 100) {
                rate = 30;
            } else if (units <= 300) {
                rate = 25;
            } else {
                rate = 20;
            }

            double blockCharge = blockUnits * rate;
            System.out.printf("Block of %d units @ ₦%.2f/unit: ₦%.2f\n", blockUnits, rate, blockCharge);
            totalBill += blockCharge;
            remainingUnits -= blockUnits;
        }

        System.out.printf("Subtotal: ₦%.2f\n", totalBill);
		
        double discountRate = 0;
        switch (type) {
            case REGULAR:
                discountRate = 0.0;
                break;
            case BUSINESS:
                discountRate = 0.05; 
                break;
            case VIP:
                discountRate = 0.10; 
                break;
        }

        double discountAmount = totalBill * discountRate;
        double finalBill = totalBill - discountAmount;

        System.out.printf("Discount (%.0f%% for %s): ₦%.2f\n", discountRate * 100, type, discountAmount);
        System.out.println("--------------------");

        return finalBill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        System.out.println("Enter customer type (REGULAR, BUSINESS, VIP): ");
        String typeInput = scanner.next().toUpperCase();
        CustomerType customerType;

        try {
            customerType = CustomerType.valueOf(typeInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid customer type entered. Defaulting to REGULAR.");
            customerType = CustomerType.REGULAR;
        }

        double totalBill = calculateBill(unitsConsumed, customerType);
		
        System.out.println("\n--- Final Bill Summary ---");
        System.out.println("Customer Name: " + customerName);
        System.out.printf("Total Units Consumed: %d units\n", unitsConsumed);
        System.out.printf("Total Bill Amount: ₦%.2f\n", totalBill);
        System.out.println("--------------------------");

    }
}
	
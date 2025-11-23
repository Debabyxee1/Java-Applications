boolean[] seats = new boolean[10];

Scanner input = new Scanner(System.in);

while (true) {
    System.out.println("Type 1 for First Class, 2 for Economy");
    int choice = input.nextInt();

    // First class
    if (choice == 1) {
        boolean assigned = false;
        for (int i = 0; i < 5; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.println("Seat " + (i+1) + " First Class");
                assigned = true;
                break;
            }
        }
        // Full → offer economy
    }
}

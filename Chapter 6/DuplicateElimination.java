Scanner input = new Scanner(System.in);
int[] unique = new int[5];
int count = 0;

for (int i = 0; i < 5; i++) {
    int num = input.nextInt();

    boolean duplicate = false;
    for (int j = 0; j < count; j++) {
        if (unique[j] == num) {
            duplicate = true;
            break;
        }
    }

    if (!duplicate) {
        unique[count++] = num;
        System.out.println(num);
    }
}

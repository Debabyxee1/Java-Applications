Random rand = new Random();
int[] freq = new int[13];

for (int i = 0; i < 36000000; i++) {
    int d1 = 1 + rand.nextInt(6);
    int d2 = 1 + rand.nextInt(6);
    int sum = d1 + d2;
    freq[sum]++;
}

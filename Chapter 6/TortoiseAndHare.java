import java.util.Random;

public class TortoiseAndHare {
    private static final int FINISH = 70;
    private static final int START = 1;

    public static void main(String[] args) {
        int tortoisePos = START;
        int harePos = START;

        Random rand = new Random();

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        // Loop until one (or both) reaches or passes the finish
        while (tortoisePos < FINISH && harePos < FINISH) {
            // Tortoise move
            int i = rand.nextInt(10) + 1; // 1..10
            if (i >= 1 && i <= 5) {            // Fast plod
                tortoisePos += 3;
            } else if (i == 6 || i == 7) {     // Slip
                tortoisePos -= 6;
            } else {                           // Slow plod (8..10)
                tortoisePos += 1;
            }

            // Hare move
            int j = rand.nextInt(10) + 1; // 1..10
            if (j == 1 || j == 2) {               // Sleep
                harePos += 0;
            } else if (j == 3 || j == 4) {        // Big hop
                harePos += 9;
            } else if (j == 5) {                  // Big slip
                harePos -= 12;
            } else if (j >= 6 && j <= 8) {        // Small hop
                harePos += 1;
            } else {                              // Small slip (9..10)
                harePos -= 2;
            }

            // Keep positions >= 1
            if (tortoisePos < 1) tortoisePos = 1;
            if (harePos < 1) harePos = 1;

            // Print board line: 70 positions
            printRaceLine(tortoisePos, harePos);

            // Check for winner(s)
            if (tortoisePos >= FINISH && harePos >= FINISH) {
                // If both reach on same tick, favor the tortoise (underdog)
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (tortoisePos >= FINISH) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (harePos >= FINISH) {
                System.out.println("Hare wins. Yuch.");
                break;
            }

            // Wait one second to simulate the clock tick (remove/adjust as desired)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static void printRaceLine(int tortoisePos, int harePos) {
        int finishWidth = FINISH;
        StringBuilder line = new StringBuilder();

        // positions in spec are 1..70. Build 70-character field.
        for (int p = 1; p <= finishWidth; p++) {
            if (p == tortoisePos && p == harePos) {
                // Put OUCH!!! starting at this position. We will pad the rest of the output
                // so the line remains visually length ~70. Replace the current position
                // with 'O' and then append "UCH!!!" (this spans multiple chars).
                line.append('O');
                // Append the rest of "UCH!!!" directly; this makes the printed line longer
                // than 70 characters in case of OUCH!!! but matches the exercise requirement.
                line.append("UCH!!!");
                // skip printing further markers for the same tick; fill remaining positions with spaces
                for (int q = p + 1; q <= finishWidth; q++) {
                    line.append(' ');
                }
                break;
            } else if (p == tortoisePos) {
                line.append('T');
            } else if (p == harePos) {
                line.append('H');
            } else {
                line.append(' ');
            }
        }

        System.out.println(line.toString());
    }
}

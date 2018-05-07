package loop;

import java.util.Random;

public class HeadsOrTails {
    public static final int HEAD = 1;

    public static String countHeadsAndTails(long n) {
        final Random random = new Random();
        long numberOfHeads = 0;
        for (long i = 0; i < n; i++) {
            int randNumber = random.nextInt(2);
            if (randNumber == HEAD) {
                numberOfHeads++;
            }
        }

        return "\n***** Task1 *****\n" + "number of heads = " + numberOfHeads +
                "\nnumber of tails = " + (n - numberOfHeads) + "\n";
    }
}
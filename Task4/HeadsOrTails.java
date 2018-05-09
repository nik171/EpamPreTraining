package loop;

import java.util.Random;

public class HeadsOrTails {

    public static String countHeadsAndTails(long n) {
        final Random random = new Random();
        long numberOfHeads = 0;
        for (long i = 0; i < n; i++) {
            boolean randNumber = random.nextBoolean();
            if (randNumber == true) {
                numberOfHeads++;
            }
        }

        return "\n***** Task1 *****\n" + "number of heads = " + numberOfHeads +
                "\nnumber of tails = " + (n - numberOfHeads) + "\n";
    }
}

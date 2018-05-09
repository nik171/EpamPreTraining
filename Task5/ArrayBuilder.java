package arrays;

import java.util.Random;

public class ArrayBuilder {

    public static double[] buildArray(int n, double minVal, double maxVal) {
        final Random random = new Random();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = minVal + (maxVal - minVal) * random.nextDouble();
        }

        return array;
    }
}

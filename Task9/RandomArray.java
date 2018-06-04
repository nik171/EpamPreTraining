package by.epam.preTraining.FilatovNI.tasks.task9.model;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	public static double[] buildRandomArray(int n, double minVal, double maxVal) {
        final Random random = new Random();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = minVal + (maxVal - minVal) * random.nextDouble();
        }

        return array;
    }
	
}

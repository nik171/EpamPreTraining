package arrays;

public class Task10 {
    public static double findMinElement(double[] array) {
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static double calcSum(double[] array) {
        double sum = 0;
        int lastIndex = array.length;
        boolean isLast = false, isFirst = false;

        for (int i = 0, j = array.length - 1; i <= lastIndex - 1 && j > 0; i++, j--) {
            if (isFirst) {
                sum += array[i];
            }
            if ((array[j] > 0) && (isLast == false)) {
                lastIndex = j;
                isLast = true;
            }
            if ((array[i] > 0) && (isFirst == false)) {
                isFirst = true;
            }
        }

        return sum;
    }
}

package arrays;

public class ArrayWorker {
    public static String findMinMaxValue(double[] array) {
        double min = array[0];
        double max = min;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        return ArrayPrinter.printArray(array) + "min = " + min + "\nmax = " + max + "\n";
    }

    public static String calcMediumValues(double[] array) {
        double sum = 0, mult = 1;
        double power = (double) 1 / array.length;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            mult *= array[i];
        }

        return "arithmetic = " + (sum / array.length) +
                "\ngeometric = " + Math.pow(mult, power) + "\n";
    }

    public static boolean isOrdered(double[] array) {
        for (int i = 1; i < array.length; i++) {
            if (((array[i] > array[i - 1]) && (array[i + 1] < array[i])) ||
                    ((array[i] < array[i - 1]) && (array[i + 1] > array[i]))) {
                return false;
            }
        }

        return true;
    }

    public static double findLocalMinMax(double[] array) {
        for (int i = 1; i < array.length; i++) {
            if (((array[i] > array[i - 1]) && (array[i + 1] < array[i])) ||
                    ((array[i] < array[i - 1]) && (array[i + 1] > array[i]))) {
                return array[i];
            }
        }

        return -1;
    }

    public static String reverseArray(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = (array[i] + array[array.length - i - 1]) - (array[array.length - i - 1] = array[i]);
        }

        return ArrayPrinter.printArray(array);
    }
}

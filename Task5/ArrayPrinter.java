package arrays;

public class ArrayPrinter {
    public static String printArray(double[] array) {
        String strArray = "array:\n";
        for (int i = 0; i < array.length; i++) {
            strArray += array[i] + " ";
        }
        strArray += "\n";

        return strArray;
    }
}

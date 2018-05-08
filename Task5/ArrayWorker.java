package arrays;

public class ArrayWorker {
    public static String findMinMaxValue(int n, double minValue, double maxValue){
        double[] array  =ArrayBuilder.buildArray(n, minValue, maxValue);
        double min = array[0];
        double max = min;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            else if(array[i] < min){
                min = array[i];
            }
        }

        return ArrayPrinter.printArray(array) + "min = " + min + "\nmax = " + max + "\n";
    }

    public static String calcMediumValues(int n, double minValue, double maxValue){
        double[] array  =ArrayBuilder.buildArray(n, minValue, maxValue);
        double sum = 0, mult = 1;
        double power = (double)1 / n;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
            mult *= array[i];
        }

        return ArrayPrinter.printArray(array) + "arithmetic = " + (sum / n) +
                "\ngeometric = " + Math.pow(mult, power) + "\n";
    }
}

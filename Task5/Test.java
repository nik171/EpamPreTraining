package arrays;

public class Test {
    public static void main(String[] args) {
        double[] array = ArrayBuilder.buildArray(10, -10, 10);
        AnswerPrinter.printAnswer("\nTask1:\n" + ArrayWorker.findMinMaxValue(array));
        AnswerPrinter.printAnswer("\nTask2:\n" + ArrayWorker.calcMediumValues(array));
        AnswerPrinter.printAnswer("\nTask3:\n" + ArrayWorker.isOrdered(array) + "\n");
        AnswerPrinter.printAnswer("\nTask4:\nlocal min(max) = " + ArrayWorker.findLocalMinMax(array) + "\n");
        AnswerPrinter.printAnswer("\nTask5:\n" + "reverse " + ArrayWorker.reverseArray(array));
        AnswerPrinter.printAnswer("\nTask10_1:\nmin = " + Task10.findMinElement(array) + "\n");
        AnswerPrinter.printAnswer("\nTask10_2:\nsum between first and last positive = " + Task10.calcSum(array));
    }
}

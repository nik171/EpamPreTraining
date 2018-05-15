package matrix;

public class Test {
    public static void main(String[] args) {
        double[][] matrix = MatrixBuilder.buildMatrix(3, 3, -10, 10);
        MatrixPrinter.printMatrix(matrix);
        AnswerPrinter.printAnswer("\nTask1\n" + MatrixWorker.printArray(MatrixWorker.findMinMax(matrix)));
        AnswerPrinter.printAnswer("\nTask2\n" + MatrixWorker.printArray(MatrixWorker.calcMediumValues(matrix)));
        AnswerPrinter.printAnswer("\nTask3\n" + MatrixWorker.printArray(MatrixWorker.findLocalMinMax(matrix)));
    }
}

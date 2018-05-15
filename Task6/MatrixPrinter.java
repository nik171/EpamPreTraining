package matrix;

public class MatrixPrinter {
    public static void printMatrix(double[][] array){
        for(double[] a:array){
            for(double e:a){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

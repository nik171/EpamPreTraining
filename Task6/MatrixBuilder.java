package matrix;

import java.util.Random;

public class MatrixBuilder {
    public static double[][]buildMatrix(int n, int m, double minVal, double maxVal){
        final Random random = new Random();
        double[][] array = new double[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                array[i][j] = minVal + (maxVal - minVal) * random.nextDouble();
            }
        }

        return array;
    }
}

package matrix;

public class Task10 {
    public static int[]calcMinLine(double[][] array){
        int[][] matrix = new int[array.length][];
        int minSum = Integer.MAX_VALUE, sum = 0;
        int index = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                matrix[i][j] = (int) array[i][j];
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(matrix[i][j] % 2 == 0){
                    break;
                }
                sum += matrix[i][j];
            }
            if(sum < minSum){
                minSum = sum;
                index = i;
            }
        }

        return matrix[index];
    }
}

package matrix;

public class MatrixWorker {
    public static String printArray(double[] array){
        String answer = "";
        for(double d : array){
            answer += d + " ";
        }
        return answer;
    }
    public static double[] findMinMax(double[][] array){
        double answer[] = new double[2];
        double min = 0, max = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if (array[i][j] > max) {
                    max = array[i][j];
                } else if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }

        answer[0] = min;
        answer[1] = max;

        return answer;
    }

    public static double[] calcMediumValues(double[][] array){
        double[] answer = new double[2];
        double sum = 0, mult = 1;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                mult *= array[i][j];
                count++;
            }
        }

        double power = (double) 1 / count;
        answer[0] = sum / count;
        answer[1] = Math.pow(mult, power);

        return answer;
    }

    public static double[] findLocalMinMax(double[][] array) {
        double[] answer = new double[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        if (((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i + 1][j + 1]) &&
                                (array[i][j] > array[i + 1][j])) || ((array[i][j] < array[i][j + 1]) &&
                                (array[i][j] < array[i + 1][j + 1]) && (array[i][j] < array[i + 1][j]))) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                            return answer;
                        }
                    } else if (j == array[i].length - 1) {
                        if (((array[i][j] > array[i][j - 1]) && (array[i][j] > array[i + 1][j - 1]) &&
                                (array[i][j] > array[i + 1][j])) || ((array[i][j] < array[i][j - 1]) &&
                                (array[i][j] < array[i + 1][j - 1]) && (array[i][j] < array[i + 1][j]))) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                            return answer;
                        }
                    } else {
                        if (((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i + 1][j + 1]) &&
                                (array[i][j] > array[i + 1][j]) && (array[i][j] > array[i + 1][j - 1]) &&
                                (array[i][j] > array[i][j - 1])) || ((array[i][j] < array[i][j + 1]) &&
                                (array[i][j] < array[i + 1][j + 1]) && (array[i][j] < array[i + 1][j]) &&
                                (array[i][j] > array[i + 1][j - 1]) && (array[i][j] > array[i][j - 1]))) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                            return answer;
                        }
                    }
                } else if (i == array.length - 1) {
                    if (j == 0) {
                        if (((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i - 1][j + 1]) &&
                                (array[i][j] > array[i - 1][j])) || ((array[i][j] < array[i][j + 1]) &&
                                (array[i][j] < array[i - 1][j + 1]) && (array[i][j] < array[i - 1][j]))) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                            return answer;
                        }
                    } else if (j == array[i].length - 1) {
                        if (((array[i][j] > array[i][j - 1]) && (array[i][j] > array[i + 1][j - 1]) &&
                                (array[i][j] > array[i + 1][j])) || ((array[i][j] < array[i][j - 1]) &&
                                (array[i][j] < array[i + 1][j - 1]) && (array[i][j] < array[i + 1][j]))) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                            return answer;
                        }
                    } else {
                        if (((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i - 1][j + 1]) &&
                                (array[i][j] > array[i - 1][j]) && (array[i][j] > array[i - 1][j - 1]) &&
                                (array[i][j] > array[i][j - 1])) || ((array[i][j] < array[i][j + 1]) &&
                                (array[i][j] < array[i - 1][j + 1]) && (array[i][j] < array[i - 1][j]) &&
                                (array[i][j] > array[i - 1][j - 1]) && (array[i][j] > array[i][j - 1]))) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                            return answer;
                        }
                    }
                } else {
                    if (j == 0) {
                        if (((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i - 1][j + 1]) &&
                                (array[i][j] > array[i - 1][j]) && (array[i][j] > array[i + 1][j]) &&
                                (array[i][j] > array[i + 1][j + 1])) || ((array[i][j] < array[i][j + 1]) &&
                                (array[i][j] < array[i - 1][j + 1]) && (array[i][j] < array[i - 1][j]) &&
                                (array[i][j] > array[i + 1][j]) && (array[i][j] > array[i + 1][j + 1]))) {
                            answer[0] = i + 1;
                            answer[1] = j + 1;
                            return answer;
                        } else if (j == array.length - 1) {
                            if (((array[i][j] > array[i - 1][j]) && (array[i][j] > array[i - 1][j - 1]) &&
                                    (array[i][j] > array[i][j - 1]) && (array[i][j] > array[i + 1][j - 1]) &&
                                    (array[i][j] > array[i + 1][j])) || ((array[i][j] < array[i - 1][j]) &&
                                    (array[i][j] < array[i - 1][j - 1]) && (array[i][j] < array[i][j - 1]) &&
                                    (array[i][j] > array[i + 1][j - 1]) && (array[i][j] > array[i + 1][j]))) {
                                answer[0] = i + 1;
                                answer[1] = j + 1;
                                return answer;
                            } else {
                                if (((array[i][j] > array[i][j + 1]) && (array[i][j] > array[i - 1][j + 1]) &&
                                        (array[i][j] > array[i - 1][j]) && (array[i][j] > array[i - 1][j - 1]) &&
                                        (array[i][j] > array[i][j - 1]) && (array[i][j] > array[i + 1][j - 1]) &&
                                        (array[i][j] > array[i + 1][j]) && (array[i][j] > array[i + 1][j + 1])) ||
                                        ((array[i][j] < array[i][j + 1]) &&
                                                (array[i][j] < array[i - 1][j + 1]) && (array[i][j] < array[i - 1][j]) &&
                                                (array[i][j] > array[i - 1][j - 1]) && (array[i][j] > array[i][j - 1])) &&
                                                (array[i][j] > array[i + 1][j - 1]) && (array[i][j] > array[i + 1][j]) &&
                                                (array[i][j] > array[i + 1][j + 1])) {
                                    answer[0] = i + 1;
                                    answer[1] = j + 1;
                                    return answer;
                                }
                            }
                        }
                    }
                }
            }
        }

        answer[0] = -1;
        return answer;
    }

        public static double[][] transposeMatrix (double[][] array){
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array[i].length; j++) {
                    array[j][i] = (array[j][i] + array[i][j]) - (array[i][j] = array[j][i]);
                }
            }

            return array;
        }
}

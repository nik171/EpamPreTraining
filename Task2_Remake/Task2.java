package linearalg;

public class Task2 {
    public static String calculatingSquare(double r1, double r2){
        double resultSquare, square1, square2;

        square1 = r1*r1*Math.PI;
        square2 = r2*r2*Math.PI;
        resultSquare = square1 - square2;

        return "\n***** Task2 *****\n" + "r1 = " + r1 + "\n" +
                "r2 = " + r2 + "\n" + "s = " + resultSquare + "\n";
    }
}

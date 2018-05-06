package linearalg;

public class Task6 {
    public static final double POWER = (double)1/6;

    public static String calculatingMediumValues(int n){
        int m = n;
        double sum = 0, mult = 1;

        sum += n%10;
        mult *= n%10;
        n /= 10;
        sum += n%10;
        mult *= n%10;
        n /= 10;
        sum += n%10;
        mult *= n%10;
        n /= 10;
        sum += n%10;
        mult *= n%10;
        n /= 10;
        sum += n%10;
        mult *= n%10;
        n /= 10;
        sum += n%10;
        mult *= n%10;

        return "\n***** Task6 *****\n" + "n = " + m + "\n" + "arithmetic = " + sum/6 + "\n" +
                "geometric = " + Math.pow(mult, POWER) + "\n";
    }
}

package linearalg;

public class Task5 {
    public static String calculatingSumandMulti(int n){
        int m = n;
        int sum = 0, mult = 1;

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

        return "\n***** Task5 *****\n" + "n = " + m + "\n" + "sum = " + sum + "\n"
                + "mult = " + mult + "\n";
    }
}

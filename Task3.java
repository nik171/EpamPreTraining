package linearalg;

public class Task3 {
    public static String changingValues(int a, int b){
        a = (a + b) - (b = a);

        return "\n***** Task3 *****\n" + "a = " + a + "\n" + "b = " + b + "\n";
    }
}

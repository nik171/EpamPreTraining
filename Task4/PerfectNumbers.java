package loop;

public class PerfectNumbers {
    public static String isPerfectNumber(int n) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == n) {
            return "\n***** Task3 *****\n" + "n = " + n + "\nthis number is perfect" + "\n";
        } else {
            return "\n***** Task3 *****\n" + "n = " + n + "\nthis number is not perfect" + "\n";
        }
    }
}
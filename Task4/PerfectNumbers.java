package loop;

public class PerfectNumbers {
    public static boolean isPerfectNumber(int n) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == n) {
            return true;
        }
        return false;
    }
}

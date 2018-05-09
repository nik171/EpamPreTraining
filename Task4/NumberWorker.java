package loop;

public class NumberWorker {
    public static String calcMaxDigit(int n) {
        int m = n;
        n = n > 0 ? n : -n;
        int buffer;

        int maxDigit = n % 10;
        n /= 10;

        while (n != 0) {
            buffer = n % 10;
            n /= 10;
            if (buffer > maxDigit) {
                maxDigit = buffer;
            }
        }

        return "\n***** Task2_1 *****\n" + "number = " + m +
                "\ngreatest digit = " + maxDigit + "\n";
    }

    public static boolean isPalindrome(int n) {
        n = n > 0 ? n : -n;
        int m = n;
        int palindrome = 0;

        while (n > 0) {
            palindrome = palindrome * 10 + n % 10;
            n /= 10;
        }

        if (palindrome == m) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        n = n > 0 ? n : -n;
        int m = n;

        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String calcPrimeDivisors(int n) {
        n = n > 0 ? n : -n;
        int m = n;
        String answer = "";

        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); ) {
            if (n % i == 0) {
                answer += i + " ";
                n /= i;
            } else {
                i++;
            }
        }

        if (answer != "") {
            if (n > 1) {
                answer += n;
            }
            return "\n***** Task2_4 *****\n" + "number = " + m +
                    "\nprime divisors: " + answer + "\n";
        } else {
            return "\n***** Task2_4 *****\n" + "number = " + m +
                    "\nprime" + "\n";
        }
    }

    public static String calcGCDandLCM(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        int c = a, d = b;
        int gcd;
        int coefficient = 1;
        while ((a != 0) && (b != 0)) {
            while (((a | b) & 1) == 0) {
                a >>= 1;
                b >>= 1;
                coefficient *= 2;
            }
            while ((a & 1) == 0) {
                a >>= 1;
            }
            while ((b & 1) == 0) {
                b >>= 1;
            }
            if (b >= a) {
                b -= a;
            } else {
                a -= b;
            }
        }

        gcd = a * coefficient;
        return "\n***** Task2_5 *****\n" + "a = " + c + " b = " + d + "\ngcd = " + gcd + "\nlcd = " + (c * d) / gcd + "\n";
    }

    public static String calcDifferentDigits(int n) {
        String uniqueNumbers = "";
        int m = n;
        int quantityOfUniqueNumbers = 0;

        while (n != 0) {
            int buf = n % 10;
            n /= 10;
            if (!uniqueNumbers.contains(buf + "")) {
                quantityOfUniqueNumbers++;
                uniqueNumbers += buf;
            }
        }

        return "\n***** Task2_6 *****\n" + "n = " + m + "\nunique numbers = " + quantityOfUniqueNumbers + "\n";
    }
}

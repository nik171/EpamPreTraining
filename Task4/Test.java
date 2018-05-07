package loop;

public class Test {
    public static void main(String[] args) {
        Print.printAnswer(HeadsOrTails.countHeadsAndTails(1000));
        Print.printAnswer(NumberWorker.calcMaxDigit(-456710));
        Print.printAnswer(NumberWorker.isPalindrome(1234321));
        Print.printAnswer((NumberWorker.isPrime(1113)));
        Print.printAnswer((NumberWorker.calcPrimeDivisors(1113)));
        Print.printAnswer(NumberWorker.calcGCDandLCM(256, 1024));
        Print.printAnswer(NumberWorker.calcDifferentDigits(1213141578));
        Print.printAnswer(PerfectNumbers.isPerfectNumber(33550336));
    }
}

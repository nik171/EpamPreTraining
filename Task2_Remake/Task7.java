package linearalg;

public class Task7 {
    public static String reversingNumber(int n){
        int z = n;
        int reverseNumber = 0;

        reverseNumber += (n%10)*1000000;
        n /= 10;
        reverseNumber += (n%10)*100000;
        n /= 10;
        reverseNumber += (n%10)*10000;
        n /= 10;
        reverseNumber += (n%10)*1000;
        n /= 10;
        reverseNumber += (n%10)*100;
        n /= 10;
        reverseNumber += (n%10)*10;
        n /= 10;
        reverseNumber += (n%10)*1;

        return "\n***** Task7 *****\n" + "n = " + z + "\n" + "reverse = " + reverseNumber + "\n";
    }
}

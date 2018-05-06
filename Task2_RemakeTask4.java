package linearalg;

public class Task4 {
    public static String checkingSequence(int n){
        int m = n;
        int fourthCharacter,thirdCharacter,secondCharacter,firstCharacter;

        fourthCharacter = n % 10;
        n /= 10;
        thirdCharacter = n % 10;
        n /= 10;
        secondCharacter = n % 10;
        firstCharacter = n / 10;

        return "\n***** Task4 *****\n" + "number = " + m + "\n" + (((firstCharacter > secondCharacter) &&
                (secondCharacter > thirdCharacter) && (thirdCharacter > fourthCharacter)) ||
                ((firstCharacter < secondCharacter) && (secondCharacter < thirdCharacter) &&
                        (thirdCharacter < fourthCharacter))) + "\n";
    }
}

package conditional;

import java.util.Random;

public class Task4 {
    public static final String GOOD_MOOD_1 = "(=";
    public static final String GOOD_MOOD_2 = "=)";
    public static final String NORMAL_MOOD_1 = "(-:";
    public static final String NORMAL_MOOD_2 = ":-)";

    public static String checkingMood(){
        String answer = "";
        final Random random = new Random();
        int mood = random.nextInt(4);
        answer += "\n***** Task4 *****\n";
        if(mood == 1){
            answer += GOOD_MOOD_1;
        }
        else if(mood == 2){
            answer += GOOD_MOOD_2;
        }
        else if(mood == 3){
            answer += NORMAL_MOOD_1;
        }
        else{
            answer += NORMAL_MOOD_2;
        }
        return answer;
    }
}

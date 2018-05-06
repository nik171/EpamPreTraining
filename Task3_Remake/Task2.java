package conditional;

public class Task2 {
    public static final int AGE_2 = 200;
    public static final int AGE_3 = 300;

    public static String calcHeadsandEyes(int n) {
        String answer = "";
        int head = 0;
        answer += "\n***** Task2 *****\n";
        answer += "age = " + n + "\n";
        if (n >= 0) {
            if (n >= AGE_3) {
                head += n + AGE_3 + AGE_2 + 1;
                answer += "number of heads = " + head + "\n";
                answer += "number of eyes = " + head * 2 + "\n";
                return answer;
            } else if ((n < AGE_3) && (n >= AGE_2)) {
                head += (n + 1) * 2 + AGE_2;
                answer += "number of heads = " + head + "\n";
                answer += "number of eyes = " + head * 2 + "\n";
                return answer;
            } else {
                head += (n + 1) * 3;
                answer += "number of heads = " + head + "\n";
                answer += "number of eyes = " + head * 2 + "\n";
                return answer;
            }
        } else {
            answer += "wrong number";
            return answer;
        }

    }
}

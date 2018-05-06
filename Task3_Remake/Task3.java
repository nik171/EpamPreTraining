package conditional;

public class Task3 {
    public static final String CHECKER = "aeiouy";

    public static String isVowel_1(char symbol) {
        String answer = "";
        answer += "\n***** Task3_1 *****\n";
        switch (Character.toLowerCase(symbol)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                answer += "гласная\n";
                break;
            default:
                answer += "не гласная\n";

        }

        return answer;
    }

    public static String isVowel_2(char symbol) {
        String s = "";
        s += "\n***** Task3_2 *****\n";

        if ((Character.toLowerCase(symbol) == 'a') || (Character.toLowerCase(symbol) == 'e') ||
                (Character.toLowerCase(symbol) == 'i') ||
                (Character.toLowerCase(symbol) == 'o') || (Character.toLowerCase(symbol) == 'u') ||
                (Character.toLowerCase(symbol) == 'y')) {
            s += "гласная\n";

        } else {
            s += "не гласная\n";
        }

        return s;
    }

    public static String isVowel_3(char symbol) {
        String s = "";
        s += "\n***** Task3_3 *****\n";

        if (CHECKER.indexOf(Character.toLowerCase(symbol)) != -1) {
            s += "гласная\n";
        } else {
            s += "не гласная\n";
        }

        return s;
    }

    public static String isVowel_4(char symbol) {
        String answer = "";
        answer += "\n***** Task3_4 *****\n";
        String buf = Character.toLowerCase(symbol) + "";

        if (CHECKER.contains(buf)) {
            answer += "гласная\n";
        } else {
            answer += "не гласная\n";
        }

        return answer;
    }
}

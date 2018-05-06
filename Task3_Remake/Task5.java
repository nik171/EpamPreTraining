package conditional;

public class Task5 {
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;

    public static String findingNextDay(int day, int month, int year) {
        String answer = "";
        answer += "\n***** Task5 *****\n";
        boolean b;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            b = true;
        } else {
            b = false;
        }

        if (month == JANUARY) {
            if ((day >= 1) && (day < 31)) {
                answer += day + 1 + "-" + "января" + "-" + year;
            } else {
                answer += 1 + "-" + "февраля" + "-" + year;
            }
        } else if (month == FEBRUARY) {
            if (!b) {
                if ((day >= 1) && (day < 28)) {
                    answer += day + 1 + "-" + "февраля" + "-" + year;
                } else {
                    answer += 1 + "-" + "марта" + "-" + year;
                }
            } else {
                if ((day >= 1) && (day < 29)) {
                    answer += day + 1 + "-" + "февраля" + "-" + year;
                } else {
                    answer += 1 + "-" + "марта" + "-" + year;
                }
            }
        } else if (month == MARCH) {
            if ((day >= 1) && (day < 31)) {
                answer += day + 1 + "-" + "марта" + "-" + year;
            } else {
                answer += 1 + "-" + "апреля" + "-" + year;
            }
        } else if (month == APRIL) {
            if ((day >= 1) && (day < 30)) {
                answer += day + 1 + "-" + "апреля" + "-" + year;
            } else {
                answer += 1 + "-" + "мая" + "-" + year;
            }
        } else if (month == MAY) {
            if ((day >= 1) && (day < 31)) {
                answer += day + 1 + "-" + "мая" + "-" + year;
            } else {
                answer += 1 + "-" + "июня" + "-" + year;
            }
        } else if (month == JUNE) {
            if ((day >= 1) && (day < 30)) {
                answer += day + 1 + "-" + "июня" + "-" + year;
            } else {
                answer += 1 + "-" + "июля" + "-" + year;
            }
        } else if (month == JULY) {
            if ((day >= 1) && (day < 31)) {
                answer += day + 1 + "-" + "июля" + "-" + year;
            } else {
                answer += 1 + "-" + "августа" + "-" + year;
            }
        } else if (month == AUGUST) {
            if ((day >= 1) && (day < 31)) {
                answer += day + 1 + "-" + "августа" + "-" + year;
            } else {
                answer += 1 + "-" + "сентября" + "-" + year;
            }
        } else if (month == SEPTEMBER) {
            if ((day >= 1) && (day < 30)) {
                answer += day + 1 + "-" + "сентября" + "-" + year;
            } else {
                answer += 1 + "-" + "октября" + "-" + year;
            }
        } else if (month == OCTOBER) {
            if ((day >= 1) && (day < 31)) {
                answer += day + 1 + "-" + "октября" + "-" + year;
            } else {
                answer += 1 + "-" + "ноября" + "-" + year;
            }
        } else if (month == NOVEMBER) {
            if ((day >= 1) && (day < 30)) {
                answer += day + 1 + "-" + "ноября" + "-" + year;
            } else {
                answer += 1 + "-" + "декабря" + "-" + year;
            }
        } else {
            if ((day >= 1) && (day < 31)) {
                answer += day + 1 + "-" + "декабря" + "-" + year;
            } else {
                answer += 1 + "-" + "января" + "-" + ++year;
            }
        }
        return answer;
    }
}

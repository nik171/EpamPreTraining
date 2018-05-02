package conditional;

import java.util.Random;

public class Tasks {
    public static String Task1(){
        String s = "";
        int x1 = 5, y1 = 5;
        int x2 = 5, y2 = 2;
        int x3 = 2, y3 = 2;
        double x, y, z;
        // коэффициенты прямой, проходящей через (x2,y2), (x3, y3)
        int a = y2 - y3, b = x3 - x2, c = x2*y3 - x3*y2;
        s += "\n***** Task1 *****\n";
        if(a*x1 + b*y1 + c !=0){
            s += "Данные точки являются вершинами треугольника\n";
            x = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
            y = (x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3);
            z = (x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3);
            if((x + y == z) || (x + z == y) || (y + z == x)){
                s += "Данный треугольник является прямоугольным\n";
            }
            else{
                s += "Данный треугольник не является прямоугольным\n";
            }
        }
        else{
            s += "Данные точки не являются вершинами треугольника\n";
        }
        return s;
    }
    public static String Task2(){
        String s = "";
        int n = 356;
        int head = 0;
        s += "\n***** Task2 *****\n";
        s += "age = " + n + "\n";
        if(n >= 300){
            head += n - 300 + 1 + 100*2 + 200*3;
            s += "number of heads = " + head + "\n";
            s += "number of eyes = " + head*2 + "\n";
        }
        else if((n < 300) && (n >= 200)){
            head += (n - 200 + 1)*2 + 200*3;
            s += "number of heads = " + head + "\n";
            s += "number of eyes = " + head*2 + "\n";
        }
        else{
            head += (n + 1)*3;
            s += "number of heads = " + head + "\n";
            s += "number of eyes = " + head*2 + "\n";
        }
        return s;
    }
    public static String Task3_1(){
        char symbol = 'A';
        String s = "";
        s += "\n***** Task3_1 *****\n";
        switch (symbol) {
            case 'a':
                s += "гласная\n";
                break;
            case 'e':
                s += "гласная\n";
                break;
            case 'i':
                s += "гласная\n";
                break;
            case 'o':
                s += "гласная\n";
                break;
            case 'u':
                s += "гласная\n";
                break;
            case 'y':
                s += "гласная\n";
                break;
            case 'A':
                s += "гласная\n";
                break;
            case 'E':
                s += "гласная\n";
                break;
            case 'I':
                s += "гласная\n";
                break;
            case 'O':
                s += "гласная\n";
                break;
            case 'U':
                s += "гласная\n";
                break;
            case 'Y':
                s += "гласная\n";
                break;
            default:
                s += "не гласная\n";

        }
        return s;
    }
    public static String Task3_2(){
        char symbol = 'A';
        String s = "";
        s += "\n***** Task3_2 *****\n";
        switch (symbol) {
            case 97:
                s += "гласная\n";
                break;
            case 101:
                s += "гласная\n";
                break;
            case 105:
                s += "гласная\n";
                break;
            case 111:
                s += "гласная\n";
                break;
            case 117:
                s += "гласная\n";
                break;
            case 121:
                s += "гласная\n";
                break;
            case 65:
                s += "гласная\n";
                break;
            case 69:
                s += "гласная\n";
                break;
            case 73:
                s += "гласная\n";
                break;
            case 79:
                s += "гласная\n";
                break;
            case 85:
                s += "гласная\n";
                break;
            case 89:
                s += "гласная\n";
                break;
            default:
                s += "не гласная\n";

        }
        return s;
    }
    public static String Task3_3(){
        String s = "";
        s += "\n***** Task3_3 *****\n";
        char symbol = 'z';
        if ((symbol == 'a') || (symbol == 'e') || (symbol == 'i') || (symbol == 'o') || (symbol == 'u') || (symbol == 'y')
                || (symbol == 'A') || (symbol == 'E') || (symbol == 'I') || (symbol == 'O') || (symbol == 'U') || (symbol == 'Y')) {
            s += "гласная\n";

        } else {
            s += "не гласная\n";
        }
        return s;
    }
    public static String Task3_4(){
        String s = "";
        s += "\n***** Task3_3 *****\n";
        char symbol = 'z';
        if ((symbol == 0x61) || (symbol == 0x65) || (symbol == 0x69) || (symbol == 0x6F) || (symbol == 0x75) || (symbol == 0x79)
                || (symbol == 0x41) || (symbol == 0x45) || (symbol == 0x49) || (symbol == 0x4F) || (symbol == 0x55) || (symbol == 0x59)) {
            s += "гласная\n";

        } else {
            s += "не гласная\n";
        }
        return s;
    }
    public static String Task4(){
        String s = "";
        final Random random = new Random();
        int mood = random.nextInt(4);
        s += "\n***** Task4 *****\n";
        if(mood == 1){
            s += "(=";
        }
        else if(mood == 2){
            s += " =) ";
        }
        else if(mood == 3){
            s += " (-: ";
        }
        else{
            s += " :-) ";
        }
        return s;
    }
    public static String Task5(){
        String s = "";
        s += "\n***** Task5 *****\n";
        int date = 31, month = 12, year = 1700;
        boolean b;
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            b = true;
        }
        else{
            b = false;
        }

        if(month == 1){
            if((date >= 1) && (date < 31)){
                s += date + 1 + "-" + "января" + "-" + year;
            }
            else{
                s += 1 + "-" + "февраля" + "-" + year;
            }
        }
        else if(month == 2){
            if(!b){
                if((date >= 1) && (date < 28)){
                    s += date + 1 + "-" + "февраля" + "-" + year;
                }
                else{
                    s += 1 + "-" + "марта" + "-" + year;
                }
            }
            else{
                if((date >= 1) && (date < 29)){
                    s += date + 1 + "-" + "февраля" + "-" + year;
                }
                else{
                    s += 1 + "-" + "марта" + "-" + year;
                }
            }
        }
        else if(month == 3){
            if((date >= 1) && (date < 31)){
                s += date + 1 + "-" + "марта" + "-" + year;
            }
            else{
                s += 1 + "-" + "апреля" + "-" + year;
            }
        }
        else if(month == 4){
            if((date >= 1) && (date < 30)){
                s += date + 1 + "-" + "апреля" + "-" + year;
            }
            else{
                s += 1 + "-" + "мая" + "-" + year;
            }
        }
        else if(month == 5){
            if((date >= 1) && (date < 31)){
                s += date + 1 + "-" + "мая" + "-" + year;
            }
            else{
                s += 1 + "-" + "июня" + "-" + year;
            }
        }
        else if(month == 6){
            if((date >= 1) && (date < 30)){
                s += date + 1 + "-" + "июня" + "-" + year;
            }
            else{
                s += 1 + "-" + "июля" + "-" + year;
            }
        }
        else if(month == 7){
            if((date >= 1) && (date < 31)){
                s += date + 1 + "-" + "июля" + "-" + year;
            }
            else{
                s += 1 + "-" + "августа" + "-" + year;
            }
        }
        else if(month == 8){
            if((date >= 1) && (date < 31)){
                s += date + 1 + "-" + "августа" + "-" + year;
            }
            else{
                s += 1 + "-" + "сентября" + "-" + year;
            }
        }
        else if(month == 9){
            if((date >= 1) && (date < 30)){
                s += date + 1 + "-" + "сентября" + "-" + year;
            }
            else{
                s += 1 + "-" + "октября" + "-" + year;
            }
        }
        else if(month == 10){
            if((date >= 1) && (date < 31)){
                s += date + 1 + "-" + "октября" + "-" + year;
            }
            else{
                s += 1 + "-" + "ноября" + "-" + year;
            }
        }
        else if(month == 11){
            if((date >= 1) && (date < 30)){
                s += date + 1 + "-" + "ноября" + "-" + year;
            }
            else{
                s += 1 + "-" + "декабря" + "-" + year;
            }
        }
        else{
            if((date >= 1) && (date < 31)){
                s += date + 1 + "-" + "декабря" + "-" + year;
            }
            else{
                s += 1 + "-" + "января" + "-" + ++year;
            }
        }
        return s;
    }
}

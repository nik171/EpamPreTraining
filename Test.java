package conditional;

public class Test {
    public static void main(String[] args) {
        Print.printingAnswer(Task1.isTriangle(5, 5, 5, 2, 2, 2));
        Print.printingAnswer(Task2.calcHeadsandEyes(288));
        Print.printingAnswer(Task3.isVowel_1('A'));
        Print.printingAnswer(Task3.isVowel_2('y'));
        Print.printingAnswer(Task3.isVowel_3('I'));
        Print.printingAnswer(Task3.isVowel_4('z'));
        Print.printingAnswer(Task4.checkingMood());
        Print.printingAnswer(Task5.findingNextDay(31, 12, 1700));
    }
}

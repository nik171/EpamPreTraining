package conditional;

public class Task1 {
    public static String isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        String answer = "";
        double firstAngle, secondAngle, thirdAngle;
        // коэффициенты прямой, проходящей через (x2,y2), (x3, y3)
        int a = y2 - y3, b = x3 - x2, c = x2 * y3 - x3 * y2;
        answer += "\n***** Task1 *****\n";
        if (a * x1 + b * y1 + c != 0) {
            answer += "Данные точки являются вершинами треугольника\n";
            firstAngle = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            secondAngle = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
            thirdAngle = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
            if ((firstAngle + secondAngle == thirdAngle) || (firstAngle + thirdAngle == secondAngle) ||
                    (secondAngle + thirdAngle == firstAngle)) {
                answer += "Данный треугольник является прямоугольным\n";
            } else {
                answer += "Данный треугольник не является прямоугольным\n";
            }
        } else {
            answer += "Данные точки не являются вершинами треугольника\n";
        }
        return answer;
    }
}

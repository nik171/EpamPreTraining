package linearalg;

public class LinearAlgorithms {
    public static void Task1(){
        double m = 68;
        double m1, m2, m3;
        m1 = m*1000000;
        m2 = m*1000;
        m3 = m/1000;
        System.out.println("\n***** Task1 *****");
        System.out.println(m + " kg = " + m1 + " mg");
        System.out.println(m + " kg = " + m2 + " g");
        System.out.println(m + " kg = " + m3 + " t");
    }
    public static void Task2(){
        double r1 = 10.5, r2 = 5.5, s, s1, s2;
        s1 = r1*r1*Math.PI;
        s2 = r2*r2*Math.PI;
        s = s1 - s2;
        System.out.println("\n***** Task2 *****");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("s = " + s);
    }
    public static void Task3(){
        int a = 5, b = 6;
        a += b;
        b = a - b;
        a -= b;
        System.out.println("\n***** Task3 *****");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void Task4(){
        int n = 4321;
        int m = n;
        int a,b,c,d;
        a = n % 10;
        n /= 10;
        b = n % 10;
        n /= 10;
        c = n % 10;
        d = n / 10;
        System.out.println("\n***** Task4 *****");
        System.out.println("number = " + m);
        boolean res = (((d > c) && (c > b) && (b > a)) || ((d < c) && (c < b) && (b < a)));
        System.out.println(res);

    }
    public static void Task5(){
        int x = 12345;
        int y = x;
        int sum = 0, mult = 1;
        int b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        System.out.println("\n***** Task5 *****");
        System.out.println("n = " + y);
        System.out.println("sum = " + sum);
        System.out.println("mult = " + mult);
    }
    public static void Task6(){
        int x = 123456;
        int y = x;
        double sum = 0, mult = 1, p = (double)1/6;
        int b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        x /= 10;
        b = x%10;
        sum += b;
        mult *= b;
        sum /= 6;
        System.out.println("\n***** Task6 *****");
        System.out.println("n = " + y);
        System.out.println("arithmetic = " + sum);
        System.out.println("geometric = " + Math.pow(mult, p));
    }
    public static void Task7(){
        int x = 1234567;
        int z = x;
        int y = 0;
        y += (x%10)*1000000;
        x /= 10;
        y += (x%10)*100000;
        x /= 10;
        y += (x%10)*10000;
        x /= 10;
        y += (x%10)*1000;
        x /= 10;
        y += (x%10)*100;
        x /= 10;
        y += (x%10)*10;
        x /= 10;
        y += (x%10)*1;
        x /= 10;
        System.out.println("\n***** Task7 *****");
        System.out.println("n = " + z);
        System.out.println("reverse = " + y);
    }
}

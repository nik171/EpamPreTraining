package linearalg;

public class Task1 {
    public static final int CONVERTER1 = 1000000;
    public static final int CONVERTER2 = 1000;

    public static String converting(double m){
        double milligrams, grams, tones;

        milligrams = m*CONVERTER1;
        grams = m*CONVERTER2;
        tones = m/CONVERTER2;

        return "\n***** Task1 *****\n" + m + " kg = " + milligrams + " mg\n" + m + " kg = " + grams + " g\n" +
                m + " kg = " + tones + " t\n";
    }
}

import java.util.Scanner;

public class CentimetersToInches {
    public static void main(String[] args) {
        double cm;
        int inch;
        final double CM_TO_INCH = 2.54;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Centimeters? ");
        cm = in.nextDouble();
        inch = (int) (cm / CM_TO_INCH);
        
        System.out.printf("%.2fcm = %din\n", cm, inch);
        
        in.close();
    }
}
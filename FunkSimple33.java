import java.util.Scanner;

public class FunkSimple33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println(RadToDeg(a));
        System.out.println(RadToDeg(b));
        System.out.println(RadToDeg(c));
    }

    public static double RadToDeg (double x){
        double l;
        l = x * 180 / Math.PI;
        return l;
    }
}

import java.util.Scanner;

public class FunkSimple18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println(yuzi(a));
        System.out.println(yuzi(b));
        System.out.println(yuzi(c));
    }

    public static double yuzi (double a){
        double s;
        s = Math.PI * a * a;
        return s;
    }
}

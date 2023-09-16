import java.util.Scanner;

public class FunkSimple2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        PowerA2(a);
        powerA3(a);
        PowerA2(b);
        powerA3(b);
        PowerA2(c);
        powerA3(c);
    }

    public static  void PowerA2(double a) {
        System.out.println(a*a);
    }

    public  static  void powerA3 (double b){
        System.out.println( b * b * b);
    }
}

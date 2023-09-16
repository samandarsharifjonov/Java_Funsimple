import java.util.Scanner;

public class FunkSimple37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        int x = scanner.nextInt();
        System.out.println(power1(a,x));
        System.out.println(power1(b,x));
        System.out.println(power1(c,x));


    }

    public static double power1 ( double x, double y){
        double pow = Math.pow(x,y);
        return pow;
    }
}

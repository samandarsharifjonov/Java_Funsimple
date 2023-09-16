import java.util.Scanner;

public class FunkSimple32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println(DegToRad(a));
        System.out.println(DegToRad(b));
        System.out.println(DegToRad(c));

    }


    public static Double DegToRad ( Double x){
        Double l;
        l = x * Math.PI/180;
        return l;
    }
}

import java.util.Scanner;

public class FunkSimple1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int x = scanner.nextInt();
     int x1 = scanner.nextInt();
     int x2 = scanner.nextInt();
     float x3 = scanner.nextFloat();
     float x4 = scanner.nextFloat();
     powerA3(x,x1, x2, x3, x4);

    }

    public  static void powerA3 ( int a, int b, int c,float d, float e){
        System.out.println(a*a*a);
        System.out.println(b*b*b);
        System.out.println(c*c*c);
        System.out.println(d*d*d);
        System.out.println(e*e*e);
    }

}
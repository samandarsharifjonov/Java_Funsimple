import java.util.Scanner;

public class FunkSimple19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float r1 = scanner.nextFloat();
        float r2 = scanner.nextFloat();
        System.out.println(RingS(r1, r2));


    }

    public static double RingS (double r1, double r2){
       double s1, s2;
       s1 = Math.PI * r1 * r1;
       s2 = Math.PI * r2 * r2;
       return (float)Math.abs(s1 - s2);
    }


}

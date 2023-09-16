import java.util.Scanner;

public class FunkSimple20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        System.out.println(TriangleP(a,b));

    }

    public static float TriangleP (float a, float b) {
       float c = (float) Math.sqrt((a * a) + (b * b));
       float P = a + b + c;

       return (float)P;
    }


}

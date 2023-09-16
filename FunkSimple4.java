import java.util.Scanner;

public class FunkSimple4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        triangle( a);
        triangle( b);
        triangle( c);
    }

    public static void triangle (float a){
        System.out.println(a+a+a);
        System.out.println(Math.sqrt(3)/4*(a*a));
    }
}

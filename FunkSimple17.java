import java.util.Scanner;

public class FunkSimple17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(ildiz(a, b, c));

    }

    public static int ildiz(int a, int b, int c) {
        int d;

        d = b * b - 4 * a * c;

        if (d > 0) {
            return 2;
        }

        if ( d == 0){
            return 1;
        }
        return 0;



    }
}


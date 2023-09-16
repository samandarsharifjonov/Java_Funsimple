import java.util.Scanner;

public class FunkSimple34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Fac(a));
        System.out.println(Fac(b));
        System.out.println(Fac(c));

    }

    public static int Fac ( int x ){
        int sum = 1;

        for (int i = 1; i <=x ; i++) {
            sum*=i;

        }

        return sum;
    }
}

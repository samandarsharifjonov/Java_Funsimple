import java.util.Scanner;

public class FunkSimple35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Fac2(a));
        System.out.println(Fac2(b));
        System.out.println(Fac2(c));

    }

    public static int Fac2 (int x){
        int sum = 1, k = 1;
        while (x > 0){
            sum = sum * x;
            x = x - 2;
        }

        return sum;
    }
}

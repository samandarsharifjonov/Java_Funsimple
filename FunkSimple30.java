import java.util.Scanner;

public class FunkSimple30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int k3 = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(digit(k1, n));
        System.out.println(digit(k2, n));
        System.out.println(digit(k3, n));
    }
    public static int digit (int k, int n){
        int num = 0;
        if (DigitCount(k) < n) num = -1;
        for (int i = DigitCount(k); i > 0; i--) {
            if (i == n) num = k % 10;
            else k /= 10;
        }

        return num;
    }
    public static int DigitCount (int x){
        int sum = 0;

        while (x > 0){
            x /= 10;
            sum++;
        }

        return sum;
    }
}

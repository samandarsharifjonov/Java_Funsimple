import java.util.Scanner;

public class FunkSimple49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // int c = scanner.nextInt();
        System.out.println(ekub3(n, a, b));

    }

    public static int ekub3(int x, int y, int z) {
        int EKUB = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && y % i == 0 && z % i == 0) {
                EKUB = i;
            }

        }
        return EKUB;
    }
}

import java.util.Scanner;

public class FunkSimple46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Ekub(n, a));
        System.out.println(Ekub(n, b));
        System.out.println(Ekub(n, c));

    }

    public static int Ekub (int x, int y){
        int EKUB = 0;
        for (int i = 1; i <=x ; i++) {
            if (x%i==0 && y % i == 0){
                EKUB = i;
            }

        }

        return EKUB;
    }
}

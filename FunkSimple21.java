import java.util.Scanner;

public class FunkSimple21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(AB(b, a));
        System.out.println(AB(c, b));

    }

    public static int AB (int x1, int x2){
        int sum = 0;
        if ( x1 >= x2 ){

            for (int i = x2; i <= x1; i++) {
                sum += i;
            }

        }

        return sum;


    }
}

import java.util.Scanner;

public class FunkSimple06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(sum(a));
        System.out.println(sum(b));
        System.out.println(sum(c));

    }


    public static int sum (int x){
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        return sum;
    }

}

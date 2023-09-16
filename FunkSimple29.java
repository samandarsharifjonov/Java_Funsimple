import java.util.Scanner;

public class FunkSimple29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(DigitCount(a));
    }

    public static int DigitCount (int x){
        int sum = 0;

        while (x > 0){
            sum++;
            x = x / 10;
        }

        return sum;
    }
}

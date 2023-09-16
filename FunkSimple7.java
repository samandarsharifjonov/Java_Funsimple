import java.util.Scanner;

public class FunkSimple7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(tes(a));
        System.out.println(tes(b));
        System.out.println(tes(c));


    }

    public static int tes(int son) {
        int teskari = 0;

        while (son > 0) {
            teskari = teskari * 10 + son % 10;
            son = son / 10;
        }
        return teskari;
    }
}

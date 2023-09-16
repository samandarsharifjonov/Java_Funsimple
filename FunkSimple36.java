import java.util.Scanner;

public class FunkSimple36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(Fib(a));
    }

    public static int Fib (int x){
        int f1 = 1, f2 = 1, f3 = 1;
        for (int i = 2; i < x ; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;

        }
        return f3;


    }
}

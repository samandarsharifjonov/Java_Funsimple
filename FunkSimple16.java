import java.util.Scanner;

public class FunkSimple16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(ishora(a)+ishora(b));

    }
    public static int ishora(int a) {

        if ( a > 0 ){
           return 1;

        }  if (a < 0) {
            return -1;
        }

        return 0;
    }

}
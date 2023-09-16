import java.util.Scanner;

public class FunkSimple24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(even(a));
        System.out.println(even(b));
        System.out.println(even(c));


    }

    public static String even (int x){
        int result;
        if (x % 2 == 0){
           return "juft";
        }else {
            return "toq";
        }
    }
}

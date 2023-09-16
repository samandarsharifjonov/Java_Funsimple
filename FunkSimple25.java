import java.util.Scanner;

public class FunkSimple25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(IsSquare(a));
        System.out.println(IsSquare(b));


    }

    public static String IsSquare (int k) {

        for(int i = 1; i<=k; i++){
            if(k==i*i){
                return "kvadrati";
            }
        }
       return "kvadrati EMAS";
    }
}

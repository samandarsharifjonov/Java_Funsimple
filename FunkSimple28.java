import java.util.Scanner;

public class FunkSimple28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int soni = 0;

        for (int i = 1; i <=k ; i++) {
            int a = scanner.nextInt();
            if (IsPrime(a)){
                soni++;
            }
        }
        System.out.println((soni));

    }

    public static boolean IsPrime (int x){

        if ( x <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if ( x % i == 0){
                return false;
            }
        }
        return true;
    }
}

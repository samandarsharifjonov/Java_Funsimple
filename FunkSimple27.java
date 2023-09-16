import java.util.Scanner;

public class FunkSimple27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(IsPower(n, a)+IsPower(n, b)+IsPower(n, c)+IsPower(n, d)+IsPower(n, e));

    }
    public static int IsPower ( int n, int k){
            int s = 0;
        for (int i = 1; i <=k ; i*=n) {
            if (k == i){
                s++;
            }
        }
       return s;
    }
}

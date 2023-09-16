import java.util.Scanner;

public class FunkSimple26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e= scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(IsPower5(a)+IsPower5(b)+IsPower5(c)+IsPower5(e)+IsPower5(d));

    }

    public static int IsPower5 (int k){
        int s = 0;
        for(int i = 1; i<=k; i*=5){
            if(i==k){
                s++;
            }
        }
        return s;
    }
}

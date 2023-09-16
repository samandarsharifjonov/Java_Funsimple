import java.util.Scanner;

public class FunkSimple47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Ekuk(x,a));
        System.out.println(Ekuk(x,b));
        System.out.println(Ekuk(x,c));

    }

    public static int Ekuk ( int a, int b){
        int EKUK = a;
        while (EKUK % a != 0 || EKUK % b != 0){
            EKUK ++;
        }

        return  EKUK;
    }
}

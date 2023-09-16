import java.util.Scanner;

public class FunkSimple23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(quarter(a, b));

    }

    public static int quarter ( int x, int y){
        int chorak = 0;
        if ( x > 0 && y > 0){
            chorak = 1;
        } else if ( x < 0 && y > 0) {
            chorak = 2;
        } else if (x < 0 && y < 0) {
            chorak = 3;
        } else if (x > 0 && y < 0) {
            chorak = 4;
        }

        return chorak;


    }




}

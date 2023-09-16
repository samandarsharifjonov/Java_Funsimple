import java.util.Scanner;

public class FunkSimple52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if (IsLeapYear(y1)) {
            System.out.println("Kabisa yil");
        }
        if (!(IsLeapYear(y1))) {
            System.out.println("Kabisa yil emas");
        }

        if (IsLeapYear(y2)) {
            System.out.println("Kabisa yil");
        }

        if (!(IsLeapYear(y2))) {
            System.out.println("Kabisa yil emas");
        }

        if (IsLeapYear(y3)) {
            System.out.println("Kabisa yil");
        }

        if(!(IsLeapYear(y3))) {
            System.out.println("Kabisa yil emas");
        }


    }


    public static boolean IsLeapYear ( int x){
        return  (x % 4 == 0 && x % 100 != 0 || x % 400 == 0);

    }
}

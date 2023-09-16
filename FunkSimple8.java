import java.util.Scanner;

public class FunkSimple8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();
        int raqam = scanner.nextInt();
        System.out.println(AddRightDigit(son, raqam));

    }

    public static int  AddRightDigit ( int son, int raqam){
        int result;
        result = (son * 10) + raqam;

        return  result;
    }


}

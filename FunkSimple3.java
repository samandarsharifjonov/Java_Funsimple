import java.util.Scanner;

public class FunkSimple3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();

        MEAN(a, b);
        MEAN(a, c);
        MEAN(a, d);

    }

    public  static  void MEAN (float a, float b){
        System.out.println(((a+b)/2));
        System.out.println(Math.sqrt(a * b));

    }

}

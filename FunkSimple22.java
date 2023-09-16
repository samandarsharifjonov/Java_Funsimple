import java.util.Scanner;

public class FunkSimple22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        int   c = scanner.nextInt();
        System.out.println(calc(a, b, c));

    }

    static float calc ( float a, float b, int c){
        float x = 0;

        switch (c){
            case 1: x = a - b;
            break;
            case 2: x = a * b;
            break;
            case 3: x = a / b;
            break;
            case 4: x = a + b;
        }

        return (float) x;
    }


}

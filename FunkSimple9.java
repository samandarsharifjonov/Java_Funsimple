import java.util.Scanner;

public class FunkSimple9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();
        int raqam = scanner.nextInt();
        tesk( son, raqam);

    }


    public static void tesk ( int son, int raqam){
        int soni = 0;
        int k = son;
       while ( k >  0){
           soni++;
           k /= 10;
       }

        son += (raqam * Math.pow(10,soni));
        System.out.println(son);


    }
}

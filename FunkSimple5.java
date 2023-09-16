import java.util.Scanner;

public class FunkSimple5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while ( i < 2){
            float x1 = scanner.nextFloat();
            float x2 = scanner.nextFloat();
            float y1 = scanner.nextFloat();
            float y2 = scanner.nextFloat();
            i++;
            reCtps(x1, x2, y1, y2);
        }


    }

   public static void reCtps (float x1, float x2, float y1, float y2){
       double p = 2 * (Math.abs(x1-x2)+Math.abs(y1-y2));
       double s = Math.abs(x1-x2)*Math.abs(y1-y2);
       System.out.println(p);
       System.out.println(s);

   }
}

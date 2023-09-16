

import java.util.Scanner;

public class FunkSimple31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, k = 0;
        while (i < 5) {
            i++;
            if (IsPalindrom(in.nextInt())) k++;
        }
        System.out.println(k);
    }

    public static boolean IsPalindrom(int n) {
        int m = 0, k = n;
        while (k > 0) {
            m = m * 10 + (k % 10);
            k /= 10;
        }
        return m == n;
    }
}

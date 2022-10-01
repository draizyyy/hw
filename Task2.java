import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 11, b = 2, c = 0, outp = 0;
        for (int i = 1; i <= n; ++i) {
            if (i % 2 == 1) {
                a *= 3;
                if (a > 19_000_000) {
                    System.out.println("Кроликов слишком много.");
                    outp = 1;
                    break;
                }
            } else {
                a -= b * 10;
                c += b * 10;

            }
            if (c / 70 > 0) {
                b += (c / 70);
                c -= (c / 70) * 70;
            }
        }
        if (outp != 1) {
            System.out.println(a + " " + b);
        }
    }
}
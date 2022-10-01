import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 1, b = 1, c;
        for (int i = 0; i < n - 1; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
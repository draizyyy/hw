import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, min = 9;
        while (n > 0) {
            a = n % 10;
            n /= 10;
            if (a < min && a > 0) {
                min = a;
            }
        }
        System.out.println(min);
    }
}
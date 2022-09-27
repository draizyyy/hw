import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, n;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();
        int c = n * (a * 100 + b);
        System.out.println(c / 100 + " " + c % 100);
    }
}

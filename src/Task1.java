import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n / 100 + (n % 100) / 10 + n % 10 + " " + (n + 2 - (n % 2)));
    }
}
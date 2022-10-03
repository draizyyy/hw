import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), min = 2147483647, num;
        for (int i = 0; i < n; ++i) {
            num = in.nextInt();
            if (num < min && num > 0) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
import java.util.Scanner;

public class Task3_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), min = 2147483647;
        int numbers[] = new int[n];
        for (int i = 0; i < n; ++i) {
            numbers[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            if (numbers[i] < min && numbers[i] > 0) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input, n, num = 1, output = 0;
        input = in.nextInt();
        n = in.nextInt();
        while (input > 0) {
            if (n != input % 10) {
                output += input % 10 * num;
                num *= 10;
            }
            input /= 10;
        }
        System.out.println(output);
    }
}

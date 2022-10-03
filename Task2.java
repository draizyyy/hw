import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input, output = 0, n = 0;
        input = in.nextInt();
        if (0 > input) {
            input = -input;
            n = 1;
        }
        while (input > 0) {
            output *= 10;
            output += input % 10;
            input /= 10;
        }
        if (n == 0) {
            System.out.println(output);
        }
        else {
            System.out.println("-" + output);
        }
    }
}

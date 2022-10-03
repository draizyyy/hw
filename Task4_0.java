import java.util.Scanner;

public class Task4_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), last;
        String output = "";
        int input[] = new int[n];
        for (int i = 0; i < n; ++i) {
            input[i] = in.nextInt();
        }
        last = input[0];
        for (int i = 1; i < n; ++i) {
            if (input[i] > last) {
                output += input[i] + " ";
            }
            last = input[i];
        }
        System.out.println(output);

    }
}
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), last, num;
        String output = "";
        last = in.nextInt();
        for (int i = 1; i < n; ++i) {
            num = in.nextInt();
            if (num > last) {
                output += num + " ";
            }
            last = num;
        }
        System.out.println(output);

    }
}

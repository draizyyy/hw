import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h, m, s;
        String i1 = ":", i2 = ":";
        h = n / 60 / 60;
        m = n / 60 % 60;
        s = n % 60;

        if (m < 10) {
            i1 = ":0";
        }
        if (s < 10) {
            i2 = ":0";
        }
        System.out.println(h % 24 + i1 + m + i2 + s);
    }
}
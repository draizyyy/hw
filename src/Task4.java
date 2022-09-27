import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = -2, b = 3, c = 6, d = 9;
        String m = in.next();
        Double n = Double.parseDouble(m);
        if ((n < a) || (n > b && n < c) || (n > d)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
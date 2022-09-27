import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int a1 = String.valueOf(a).length(), b1 = String.valueOf(b).length(), c1 = String.valueOf(c).length();

        if ((a % 5 == 0 && b % 5 == 0) && a1 > 2 && b1 > 2) {
            System.out.println("true");
        }
        else if ((b % 5 == 0 && c % 5 == 0) && b1 > 2 && c1 > 2) {
            System.out.println("true");
        }
        else if((a % 5 == 0 && c % 5 == 0) && a1 > 2 && c1 > 2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

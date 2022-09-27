import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        Double x = Double.parseDouble(a);
        Double y = Double.parseDouble(b);
        if (((y >= x) && (2. - x * x >= y) && (0 >= x)) || ((y > 0.) && (y <= 2. - x * x) && (Math.sqrt(2) >= x))) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

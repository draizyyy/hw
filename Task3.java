import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        String outp = " TOPT";
        if (n > 10 && n < 21) {
            outp += "OV";
        } else {
            switch (n % 10) {
                case 2:
                case 3:
                case 4:
                    outp += "A";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    outp += "OV";
            }
        }
        System.out.println(n + outp);
    }
}
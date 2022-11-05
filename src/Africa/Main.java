package Africa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator0 = in.nextInt(), denominator0 = in.nextInt();
        int numerator1 = in.nextInt(), denominator1 = in.nextInt();
        double numerator2 = in.nextDouble();
        double numerator3 = in.nextDouble();
        Africa.Fraction fraction1 = new Africa.Fraction(numerator0, denominator0);
        Africa.Fraction fraction2 = new Africa.Fraction(numerator1, denominator1);
        System.out.println("\nFraction1: " + fraction1);
        System.out.println("Fraction2: " + fraction2 + "\n");

        Africa.Fraction fraction3 = new Africa.Fraction();

        fraction3.sum(fraction1, fraction2);
        System.out.println("\nSum: " + fraction3);

        fraction3.mult(fraction1, fraction2);
        System.out.println("Mult: " + fraction3 + "\n");

        Africa.Fraction fraction4 = new Africa.Fraction(numerator2);
        Africa.Fraction fraction5 = new Africa.Fraction(numerator3);
        Africa.Fraction fraction6 = new Africa.Fraction();
        Africa.Fraction fraction7 = new Africa.Fraction();
        fraction6.sum(fraction4, fraction5);
        fraction7.mult(fraction4, fraction5);
        System.out.println("\nSum: " + fraction6);
        System.out.println("Mult: " + fraction7);

        //1
        //2
        //1
        //3
        //1,2549
        //2,16659

    }
}
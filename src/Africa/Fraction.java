package Africa;

import java.math.BigDecimal;

public class Fraction { // обыкновенная дробь
    private int numerator = 0;
    private int denominator = 1;
    Fraction(int numerator, int denominator) {
        System.out.println("1: I am constructor with numerator " + numerator + " denominator " + denominator);
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) { // numerator/1 7/1
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }
    Fraction(double fraction) {
        int amount = BigDecimal.valueOf(fraction).scale();

        numerator = (int) (fraction * Math.pow(10, amount));
        denominator = (int) Math.pow(10, amount);

        normalize();

    }

    Fraction() {
        System.out.println("3: I am an empty constructor");
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    void sum(Fraction a, Fraction b) {
        int lcm = getLcm(a.denominator, b.denominator);

        numerator = a.numerator * (lcm / a.denominator) + b.numerator * (lcm / b.denominator);
        denominator = lcm;
        normalize();
    }
    void mult(Fraction a, Fraction b) {
        numerator = a.numerator * b.numerator;
        denominator = a.denominator * b.denominator;
        normalize();
    }

    private int getLcm(int a, int b) {
        int lcm = Math.min(a, b);
        while ((lcm % a != 0) || (lcm % b != 0)) {
            ++lcm;
        }
        return lcm;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() { // НОД - Наибольший Общий Делитель и НОК - Наименьшее Общее Кратное
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }
}

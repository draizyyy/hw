public class NumberDigits {
    public static int sumOfSeven(int a, int b) {
        int sum = 0;
        for (int i = a; i < b + 1; ++i) {
            if (i % 7 == 0) {
                int n = i;
                sum += n % 10;
                n /= 10;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
            }
        }
        return sum;
    }
}
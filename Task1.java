import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = n - 1, c = a, d = b;

        int[][] array = new int[n][n];

        for (int num = 1; num < n * n + 1; ++c) {
            for (int i = c; i <= d; ++i) {
                array[a][i] = num;
                ++num;
            }
            ++a;
            for (int i = a; i <= b; ++i) {
                array[i][d] = num;
                ++num;
            }
            --d;
            for (int i = d; i >= c; --i) {
                array[b][i] = num;
                ++num;
            }
            --b;
            for (int i = b; i >= a; --i) {
                array[i][c] = num;
                ++num;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
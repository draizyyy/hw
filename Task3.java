import java.util.Scanner;
class Task3{
    public static void main(String[] args) {
        int[][] a;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        a = new int[n][m];
        for (int i = 0, j = 0, index = 0; index < n * m; ++index) {
            a[i][j] = i * j;
            ++j;
            if (j == m) {
                j = 0;
                ++i;
            }
        }
        for (int i = 0; i < n; ++i) {
            String output = "";
            for (int j = 0; j < m; ++j) {
                Integer value = a[i][j];
                output += value + "\t";
            }
            System.out.println(output);
        }
    }
}
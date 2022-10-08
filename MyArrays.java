public class MyArrays {
    public static double avgOf4Digit(int[] numbers) {
        int len = numbers[0], sum = 0, amount = 0, status = 0;
        for (int i = 1; i < len + 1; ++i)
        {
            if (numbers[i] > 999 && numbers[i] < 10000) {
                status = 1;
                break;
            }
        }
        if (status == 0) {
            return -1;
        }
        for (int i = 1; i < len + 1; ++i) {
            if (numbers[i] > 999 && numbers[i] < 10000) {;
                sum += numbers[i];
                amount++;
            }
        }
        return (double)sum / amount;
    }
    public static int[] MinToBegin(int[] numbers) {
        int len = numbers[0], max = 1_000_000_000, status = 0, index = 0;
        for (int i = 1; i < len + 1; ++i) {
            if (numbers[i] != numbers[1]) {
                status = 1;
                break;
            }
        }
        if (status == 0) {
            return new int[]{-1};
        }
        for (int i = 1; i < len + 1; ++i) {
            if (numbers[i] < max) {
                max = numbers[i];
                index = i;
            }
        }
        for (int i = index; i > 1; --i) {
            numbers[i] = numbers[i - 1];
        }
        numbers[1] = max;
        int[] output = new int[len];
        for (int i = 0; i < len; ++i) {
            output[i] = numbers[i + 1];
        }

        return output;
    }
}

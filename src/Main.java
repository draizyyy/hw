public class Main {
    public static <T extends Comparable<T>> int binarySearch(T[] a, T key, int low, int hi) {
        if (low > hi) throw new IllegalArgumentException("Low > hi!");
        if (low < 0 || hi >= a.length) throw new IllegalArgumentException("Incorrect indexes");
        int mid = 0;
        while (low <= hi) {
            mid = (low + hi) / 2;
            T value = a[mid];
            if (key.compareTo(value) == 0) {
                return mid;
            }
            if (key.compareTo(value) > 0) low = mid + 1;
            else hi = mid - 1;
        }
        return -(low + 1);
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 40, 50, 60, 70};
        int index = binarySearch(a, 40, 0, a.length - 1);
        System.out.println("Index: " + index);
        System.out.println("Value: " + a[index]);

        String[] b = {"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa"};
        int index1 = binarySearch(b, "aa", 0, b.length - 1);
        System.out.println("Index: " + index1);
        System.out.println("Value: " + b[index1]);

        MyArrayList<Integer> firstArrayList = new MyArrayList<>();
        MyArrayList<Integer> secondArrayList = new MyArrayList<>();

        firstArrayList.add(1);
        firstArrayList.add(2);
        firstArrayList.add(3);
        firstArrayList.add(4);
        firstArrayList.add(5);
        firstArrayList.add(6);
        firstArrayList.add(7);
        firstArrayList.add(8);
        firstArrayList.add(9);
        firstArrayList.add(10);
        secondArrayList.add(23);
        secondArrayList.add(45);


        System.out.println("firstArrayList: ");
        for (Integer i : firstArrayList) {
            System.out.println(i);
        }
        System.out.println("secondArrayList: ");
        for (Integer i : secondArrayList) {
            System.out.println(i);
        }

        firstArrayList.addAll(2, secondArrayList);


        System.out.println("firstArrayList: ");
        for (Integer i : firstArrayList) {
            System.out.println(i);
        }


        firstArrayList.addAll(secondArrayList);


        System.out.println("firstArrayList: ");
        for (Integer i : firstArrayList) {
            System.out.println(i);
        }

        System.out.println(firstArrayList.contains(23));
        System.out.println(firstArrayList.contains(24));

        System.out.println(firstArrayList.indexOf(23));
        System.out.println(firstArrayList.indexOf(24));
    }
}
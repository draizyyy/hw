public class Main {
    public static void main(String[] args) {
        Trinity<Integer> integerTrinity = new Trinity<>(7, 8, 9);
        System.out.println(integerTrinity.getFirst());
        System.out.println(integerTrinity.getSecond());
        System.out.println(integerTrinity.getThird());

        System.out.println(" ");

        Trinity<Integer> integerTrinity1 = new Trinity<>(9, 8, 7);
        System.out.println(integerTrinity1.getFirst());
        System.out.println(integerTrinity1.getSecond());
        System.out.println(integerTrinity1.getThird());

        System.out.println(" ");

        Trinity<String> stringTrinity = new Trinity<>("oao", "aa", "a");
        System.out.println(stringTrinity.getFirst());
        System.out.println(stringTrinity.getSecond());
        System.out.println(stringTrinity.getThird());

        System.out.println(" ");

        Trinity<String> stringTrinity1 = new Trinity<>("a", "aa", "oao");
        System.out.println(stringTrinity1.getFirst());
        System.out.println(stringTrinity1.getSecond());
        System.out.println(stringTrinity1.getThird());
    }
}

public class Exercicio33 {
    static <T extends Comparable<T>> T maior(T a, T b) { return a.compareTo(b) >= 0 ? a : b; }
    public static void main(String[] args) {
        System.out.println(maior(3, 9));
        System.out.println(maior("banana", "abacaxi"));
        System.out.println(maior(2.5, 1.5));
    }
}

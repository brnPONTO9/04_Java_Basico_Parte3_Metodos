public class Exercicio20 {
    static int contarPares(int[] numeros) {
        int c = 0;
        for (int n : numeros) if (n % 2 == 0) c++;
        return c;
    }
    public static void main(String[] args) { System.out.println(contarPares(new int[]{1, 2, 3, 4, 6, 7, 8})); }
}

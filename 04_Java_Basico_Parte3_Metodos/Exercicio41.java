import java.math.BigInteger;
public class Exercicio41 {
    static long fatorialRecursivo(int n) { return n <= 1 ? 1 : n * fatorialRecursivo(n - 1); }
    static long fatorialIterativo(int n) {
        long r = 1;
        for (int i = 2; i <= n; i++) r *= i;
        return r;
    }
    public static void main(String[] args) {
        for (int n : new int[]{0, 1, 5, 20, 21}) {
            System.out.println(n + "! rec=" + fatorialRecursivo(n) + " it=" + fatorialIterativo(n));
        }
        // Limite do long: 20! = 2.432.902.008.176.640.000 é o último que cabe; 21! estoura (overflow silencioso).
        System.out.println("21! correto com BigInteger: " + BigInteger.valueOf(21).multiply(BigInteger.valueOf(fatorialIterativo(20))));
        // Limite da pilha: recursão muito profunda causa StackOverflowError; o iterativo não tem esse problema.
        try { fatorialRecursivo(1_000_000); } catch (StackOverflowError e) { System.out.println("StackOverflowError na recursão profunda"); }
    }
}

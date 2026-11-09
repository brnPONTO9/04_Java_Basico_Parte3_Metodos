public class Exercicio42 {
    static int somarDigitos(int n) {
        n = Math.abs(n);
        if (n < 10) return n; // caso base
        return n % 10 + somarDigitos(n / 10);
    }
    public static void main(String[] args) { System.out.println(somarDigitos(482)); } // 14
}

public class Exercicio11 {
    static double subtotal(double preco, int qtd) { return preco * qtd; }
    static double desconto10(double subtotal) { return subtotal * 0.10; }
    static double totalFinal(double subtotal, double desconto) { return subtotal - desconto; }
    public static void main(String[] args) {
        double s = subtotal(49.90, 3);
        double d = desconto10(s);
        System.out.printf("Subtotal: %.2f | Desconto: %.2f | Total: %.2f%n", s, d, totalFinal(s, d));
    }
}

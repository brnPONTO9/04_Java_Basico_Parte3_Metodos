public class Exercicio18 {
    static void versaoComFinal(final int valor) {
        // valor = valor + 1; // NÃO COMPILA: cannot assign a value to final variable valor
        System.out.println("Valor recebido: " + valor);
    }
    static void versaoCorrigida(final int valor) {
        int novoValor = valor + 1; // corrigido: usa uma variável local nova
        System.out.println("Novo valor: " + novoValor);
    }
    public static void main(String[] args) {
        versaoComFinal(10);
        versaoCorrigida(10);
    }
}

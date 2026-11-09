public class Exercicio27 {
    static void validarQuantidade(int quantidade) {
        if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser maior que zero: " + quantidade);
    }
    public static void main(String[] args) {
        validarQuantidade(3);
        System.out.println("Quantidade 3 aceita");
        try { validarQuantidade(0); } catch (IllegalArgumentException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}

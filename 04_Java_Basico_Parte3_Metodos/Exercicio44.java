public class Exercicio44 {
    static class PedidoService {
        void validar(double preco, int quantidade) {
            if (preco <= 0) throw new IllegalArgumentException("Preço inválido");
            if (quantidade <= 0) throw new IllegalArgumentException("Quantidade inválida");
        }
        double calcular(double preco, int quantidade) { return preco * quantidade; }
        boolean aprovar(double total) { return total <= 5000; }
        String resumo(double total, boolean aprovado) {
            return String.format("Total R$ %.2f - %s", total, aprovado ? "APROVADO" : "EM ANÁLISE");
        }
    }
    public static void main(String[] args) {
        PedidoService s = new PedidoService();
        s.validar(250, 4);
        double total = s.calcular(250, 4);
        System.out.println(s.resumo(total, s.aprovar(total)));
        System.out.println(s.resumo(9000, s.aprovar(9000)));
    }
}

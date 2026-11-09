import java.util.List;
public class Exercicio49 {
    /** Fechamento de venda: valida, calcula desconto/imposto e devolve o resumo sem alterar a lista recebida. */
    static String fechar(List<Double> precos, boolean cliente_vip) {
        validar(precos);
        double bruto = somar(precos);
        double desconto = calcularDesconto(bruto, cliente_vip);
        double imposto = calcularImposto(bruto - desconto);
        return montarResumo(bruto, desconto, imposto);
    }
    private static void validar(List<Double> precos) {
        if (precos == null || precos.isEmpty()) throw new IllegalArgumentException("Sem itens");
        for (double p : precos) if (p <= 0) throw new IllegalArgumentException("Preço inválido: " + p);
    }
    private static double somar(List<Double> precos) { return precos.stream().mapToDouble(Double::doubleValue).sum(); }
    private static double calcularDesconto(double bruto, boolean vip) { return vip ? bruto * 0.10 : 0; }
    private static double calcularImposto(double base) { return base * 0.08; }
    private static String montarResumo(double bruto, double desconto, double imposto) {
        return String.format("Bruto %.2f | Desconto %.2f | Imposto %.2f | Total %.2f", bruto, desconto, imposto, bruto - desconto + imposto);
    }
    public static void main(String[] args) {
        System.out.println(fechar(List.of(100.0, 50.0, 25.5), true));
    }
}

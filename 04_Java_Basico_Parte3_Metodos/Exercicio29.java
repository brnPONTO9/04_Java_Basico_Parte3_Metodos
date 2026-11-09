public class Exercicio29 {
    // Antes: um main com mais de 25 linhas fazendo tudo. Depois: cinco métodos coesos.
    static double[] lerPrecos() { return new double[]{29.9, 15.5, 100.0, 8.0}; }
    static double somar(double[] v) { double s = 0; for (double x : v) s += x; return s; }
    static double aplicarDesconto(double total) { return total >= 100 ? total * 0.9 : total; }
    static double calcularImposto(double total) { return total * 0.05; }
    static void imprimirResumo(double total, double desconto, double imposto) {
        System.out.printf("Total bruto: %.2f%nCom desconto: %.2f%nImposto: %.2f%nTotal final: %.2f%n",
                total, desconto, imposto, desconto + imposto);
    }
    public static void main(String[] args) {
        double[] precos = lerPrecos();
        double total = somar(precos);
        double comDesconto = aplicarDesconto(total);
        double imposto = calcularImposto(comDesconto);
        imprimirResumo(total, comDesconto, imposto);
    }
}

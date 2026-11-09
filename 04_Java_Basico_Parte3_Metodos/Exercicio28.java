public class Exercicio28 {
    /**
     * Calcula o montante com juros compostos.
     *
     * @param capital capital inicial, deve ser positivo
     * @param taxa    taxa de juros por período em decimal (0.05 = 5%), não negativa
     * @param meses   quantidade de períodos, não negativa
     * @return o montante final (capital + juros)
     * @throws IllegalArgumentException se capital for menor ou igual a zero, taxa ou meses forem negativos
     */
    static double calcularMontante(double capital, double taxa, int meses) {
        if (capital <= 0 || taxa < 0 || meses < 0) throw new IllegalArgumentException("Parâmetros inválidos");
        return capital * Math.pow(1 + taxa, meses);
    }
    public static void main(String[] args) {
        System.out.printf("Montante: %.2f%n", calcularMontante(1000, 0.02, 12));
    }
}

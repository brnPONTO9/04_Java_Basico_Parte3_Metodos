public class Exercicio24 {
    static double calcularFrete(double peso) { return 10 + peso * 2; }
    static double calcularFrete(double peso, double distanciaKm) { return calcularFrete(peso) + distanciaKm * 0.5; }
    static double calcularFrete(double peso, double distanciaKm, boolean expresso) {
        double f = calcularFrete(peso, distanciaKm);
        return expresso ? f * 1.5 : f;
    }
    public static void main(String[] args) {
        System.out.println(calcularFrete(5));
        System.out.println(calcularFrete(5, 100));
        System.out.println(calcularFrete(5, 100, true));
    }
}

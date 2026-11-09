public class Exercicio12 {
    static double media(double n1, double n2, double n3) { return (n1 + n2 + n3) / 3; }
    static String situacao(double media) {
        if (media >= 7) return "Aprovado";
        if (media >= 5) return "Recuperação";
        return "Reprovado";
    }
    public static void main(String[] args) {
        double m = media(7, 6, 5);
        System.out.printf("Média %.2f: %s%n", m, situacao(m));
    }
}

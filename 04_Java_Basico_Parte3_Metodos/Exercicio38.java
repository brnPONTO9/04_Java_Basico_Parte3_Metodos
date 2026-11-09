public class Exercicio38 {
    static final double KM_POR_MILHA = 1.609344;
    static double metrosParaQuilometros(double metros) { return metros / 1000; }
    static double quilometrosParaMilhas(double km) { return km / KM_POR_MILHA; }
    static double metrosParaMilhas(double metros) { return quilometrosParaMilhas(metrosParaQuilometros(metros)); }
    public static void main(String[] args) {
        // nomes distintos evitam ambiguidade: todos recebem double, então uma sobrecarga por tipo seria confusa
        System.out.println(metrosParaQuilometros(5000));
        System.out.println(quilometrosParaMilhas(10));
        System.out.println(metrosParaMilhas(1609.344));
    }
}

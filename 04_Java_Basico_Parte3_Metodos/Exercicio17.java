public class Exercicio17 {
    static int somar(int... valores) {
        int total = 0;
        for (int v : valores) total += v;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(somar());
        System.out.println(somar(1, 2, 3));
        System.out.println(somar(10, 20, 30, 40, 50));
    }
}

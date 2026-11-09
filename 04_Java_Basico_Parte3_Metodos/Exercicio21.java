import java.util.Arrays;
public class Exercicio21 {
    static int[] menorEMaior(int[] valores) {
        int menor = valores[0], maior = valores[0];
        for (int v : valores) {
            if (v < menor) menor = v;
            if (v > maior) maior = v;
        }
        return new int[]{menor, maior};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(menorEMaior(new int[]{5, 3, 9, -2, 7})));
    }
}

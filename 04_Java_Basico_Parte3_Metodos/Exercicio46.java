import java.util.Arrays;
public class Exercicio46 {
    static <T> void trocar(T[] array, int i, int j) {
        if (i < 0 || i >= array.length || j < 0 || j >= array.length)
            throw new IndexOutOfBoundsException("Índices inválidos: " + i + ", " + j);
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String[] args) {
        String[] a = {"A", "B", "C", "D"};
        trocar(a, 0, 3);
        System.out.println(Arrays.toString(a));
        try { trocar(a, 0, 10); } catch (IndexOutOfBoundsException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}

public class Exercicio30 {
    static <T> T primeiro(T[] valores) {
        if (valores == null || valores.length == 0) throw new IllegalArgumentException("Array vazio ou nulo");
        return valores[0];
    }
    public static void main(String[] args) {
        System.out.println(primeiro(new String[]{"a", "b"}));
        System.out.println(primeiro(new Integer[]{10, 20}));
        try { primeiro(new String[0]); } catch (IllegalArgumentException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}

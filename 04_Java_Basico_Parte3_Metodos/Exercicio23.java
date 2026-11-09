public class Exercicio23 {
    static void alterarInt(int x) { x = 99; } // altera só a cópia local
    static void alterarArray(int[] arr) { arr[0] = 99; } // a cópia da referência aponta para o MESMO array
    public static void main(String[] args) {
        int n = 10;
        alterarInt(n);
        System.out.println(n); // 10: o valor foi copiado (pass-by-value)
        int[] a = {1, 2, 3};
        alterarArray(a);
        System.out.println(a[0]); // 99: a referência foi copiada por valor, mas aponta para o mesmo objeto
    }
}

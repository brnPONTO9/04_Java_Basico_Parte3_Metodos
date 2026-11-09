public class Exercicio16 {
    static void imprimir(String s) { System.out.println("String: " + s); }
    static void imprimir(int i) { System.out.println("int: " + i); }
    static void imprimir(double d) { System.out.println("double: " + d); }
    public static void main(String[] args) {
        imprimir("texto");
        imprimir(42);
        imprimir(3.14);
    }
}

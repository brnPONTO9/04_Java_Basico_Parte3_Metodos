import java.util.ArrayList;
import java.util.List;
public class Exercicio39 {
    static class Pedido {
        private static int contador = 0;
        private final String codigo;
        private final List<String> itens = new ArrayList<>();
        Pedido() { this.codigo = gerarCodigo(); }
        // static: não depende de um pedido específico, gera código para qualquer um
        static String gerarCodigo() { return "PED-" + (++contador); }
        // instância: altera o estado de UM pedido específico
        void adicionarItem(String item) { itens.add(item); }
        @Override public String toString() { return codigo + " " + itens; }
    }
    public static void main(String[] args) {
        Pedido p1 = new Pedido(), p2 = new Pedido();
        p1.adicionarItem("Mouse");
        p1.adicionarItem("Teclado");
        p2.adicionarItem("Monitor");
        System.out.println(p1);
        System.out.println(p2);
    }
}

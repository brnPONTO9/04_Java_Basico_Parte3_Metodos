import java.util.List;
import java.util.Optional;
public class Exercicio35 {
    record Produto(int id, String nome) {}
    static final List<Produto> CATALOGO = List.of(new Produto(1, "Mouse"), new Produto(2, "Teclado"));
    static Optional<Produto> buscarProduto(int id) {
        return CATALOGO.stream().filter(p -> p.id() == id).findFirst();
    }
    public static void main(String[] args) {
        System.out.println(buscarProduto(2).orElseThrow());
        try {
            buscarProduto(9).orElseThrow(() -> new IllegalStateException("Produto 9 não encontrado"));
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

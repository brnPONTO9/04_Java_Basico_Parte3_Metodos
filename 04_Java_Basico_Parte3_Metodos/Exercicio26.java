class Produto {
    private String nome;
    private double preco;
    Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }
    String getNome() { return nome; }
    double getPreco() { return preco; }
    void setPreco(double preco) {
        if (preco <= 0) throw new IllegalArgumentException("O preço deve ser maior que zero");
        this.preco = preco;
    }
}
public class Exercicio26 {
    public static void main(String[] args) {
        Produto p = new Produto("Caneta", 3.5);
        System.out.println(p.getNome() + ": " + p.getPreco());
        try { p.setPreco(0); } catch (IllegalArgumentException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}

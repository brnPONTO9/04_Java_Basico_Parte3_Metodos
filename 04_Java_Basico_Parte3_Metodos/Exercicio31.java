abstract class FormaPagamento {
    abstract void pagar(double valor);
}
class Pix extends FormaPagamento {
    @Override void pagar(double valor) { System.out.printf("Pagando R$ %.2f via Pix (sem taxa)%n", valor); }
}
class Cartao extends FormaPagamento {
    @Override void pagar(double valor) { System.out.printf("Pagando R$ %.2f no cartão (com taxa de 2%%: %.2f)%n", valor, valor * 1.02); }
}
public class Exercicio31 {
    public static void main(String[] args) {
        FormaPagamento[] formas = {new Pix(), new Cartao()};
        for (FormaPagamento f : formas) f.pagar(100);
    }
}

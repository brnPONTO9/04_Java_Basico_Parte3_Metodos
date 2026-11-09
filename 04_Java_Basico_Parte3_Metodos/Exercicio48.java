class SaldoInsuficienteException extends Exception {
    SaldoInsuficienteException(String msg) { super(msg); }
}
class ContaCorrente {
    private double saldo;
    ContaCorrente(double saldo) { this.saldo = saldo; }
    /** @throws SaldoInsuficienteException se o valor for maior que o saldo */
    void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) throw new SaldoInsuficienteException("Saldo " + saldo + " insuficiente para sacar " + valor);
        saldo -= valor;
    }
    double getSaldo() { return saldo; }
}
public class Exercicio48 {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente(100);
        try {
            c.sacar(60);
            c.sacar(60);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo final: " + c.getSaldo());
    }
}

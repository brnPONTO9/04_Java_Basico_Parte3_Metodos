class Conta {
    private double saldo;
    void depositar(double valor) {
        if (valor <= 0) { System.out.println("Depósito inválido: " + valor); return; }
        saldo += valor;
    }
    boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) { System.out.println("Saque inválido: " + valor); return false; }
        saldo -= valor;
        return true;
    }
    double consultarSaldo() { return saldo; }
}
public class Exercicio22 {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(-5);
        c.sacar(30);
        c.sacar(500);
        System.out.println("Saldo: " + c.consultarSaldo()); // 70.0
    }
}

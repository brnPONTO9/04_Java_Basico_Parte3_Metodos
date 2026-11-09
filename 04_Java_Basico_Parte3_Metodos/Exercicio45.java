interface EstrategiaDesconto { double aplicar(double valor); }
class SemDesconto implements EstrategiaDesconto { public double aplicar(double v) { return v; } }
class DescontoPercentual implements EstrategiaDesconto {
    private final double perc;
    DescontoPercentual(double perc) { this.perc = perc; }
    public double aplicar(double v) { return v - v * perc / 100; }
}
class DescontoFixo implements EstrategiaDesconto {
    private final double valor;
    DescontoFixo(double valor) { this.valor = valor; }
    public double aplicar(double v) { return Math.max(0, v - valor); }
}
public class Exercicio45 {
    static double calcularTotal(double valor, EstrategiaDesconto estrategia) { return estrategia.aplicar(valor); }
    public static void main(String[] args) {
        System.out.println(calcularTotal(200, new SemDesconto()));
        System.out.println(calcularTotal(200, new DescontoPercentual(10)));
        System.out.println(calcularTotal(200, new DescontoFixo(50)));
    }
}

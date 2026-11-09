interface Notificador {
    void enviar(String mensagem);
    default void enviarBoasVindas() { enviar("Bem-vindo ao sistema!"); }
}
class Email implements Notificador {
    @Override public void enviar(String m) { System.out.println("[E-mail] " + m); }
}
class SMS implements Notificador {
    @Override public void enviar(String m) { System.out.println("[SMS] " + m); }
}
public class Exercicio32 {
    public static void main(String[] args) {
        Notificador[] ns = {new Email(), new SMS()};
        for (Notificador n : ns) { n.enviarBoasVindas(); n.enviar("Seu pedido foi aprovado"); }
    }
}

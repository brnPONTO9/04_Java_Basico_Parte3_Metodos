public class Exercicio19 {
    static boolean validarSenha(String senha) {
        if (senha == null) return false;
        if (senha.isEmpty()) return false;
        if (senha.length() < 8) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(validarSenha(null));
        System.out.println(validarSenha(""));
        System.out.println(validarSenha("abc123"));
        System.out.println(validarSenha("senhaForte1"));
    }
}

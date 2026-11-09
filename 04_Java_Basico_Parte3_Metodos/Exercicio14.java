public class Exercicio14 {
    static boolean podeVotar(int idade) { return idade >= 16; }
    public static void main(String[] args) {
        int idade = 17;
        if (podeVotar(idade)) System.out.println("Pode votar");
        else System.out.println("Não pode votar");
    }
}

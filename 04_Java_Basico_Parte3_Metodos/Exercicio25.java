import java.util.Optional;
public class Exercicio25 {
    static Optional<String> buscarNome(String[] nomes, String procurado) {
        for (String n : nomes) if (n.equalsIgnoreCase(procurado)) return Optional.of(n);
        return Optional.empty();
    }
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla"};
        System.out.println(buscarNome(nomes, "bruno").orElse("não encontrado"));
        System.out.println(buscarNome(nomes, "Zeca").orElse("não encontrado"));
    }
}

import java.util.List;
import java.util.function.Function;
public class Exercicio47 {
    public static void main(String[] args) {
        Function<String, String> normalizar = String::trim;
        normalizar = normalizar.andThen(String::toLowerCase);
        List<String> nomes = List.of("  ANA ", "   ", "Bruno", "", " CARLA");
        Function<String, String> f = normalizar;
        List<String> resultado = nomes.stream().map(f).filter(s -> !s.isEmpty()).toList();
        System.out.println(resultado);
    }
}

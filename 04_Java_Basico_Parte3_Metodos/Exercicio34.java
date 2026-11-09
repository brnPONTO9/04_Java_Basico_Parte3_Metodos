import java.util.List;
public class Exercicio34 {
    public static void main(String[] args) {
        List<String> nomes = List.of("ana", "bruno", "carla");
        nomes.forEach(System.out::println); // referência a método de instância de objeto
        List<String> maiusculas = nomes.stream().map(String::toUpperCase).toList(); // referência a método de tipo
        System.out.println(maiusculas);
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
public class Exercicio37 {
    static List<String> lerLinhas(Path arquivo) throws IOException { return Files.readAllLines(arquivo); }
    public static void main(String[] args) {
        try {
            Path temp = Files.createTempFile("ex37", ".txt");
            Files.writeString(temp, "linha 1\nlinha 2\n");
            lerLinhas(temp).forEach(System.out::println);
            Files.delete(temp);
            lerLinhas(Path.of("arquivo-que-nao-existe.txt"));
        } catch (IOException e) {
            System.out.println("Erro de I/O tratado no main: " + e);
        }
    }
}

import java.util.*;

interface Notificavel { void notificar(String msg); }

class ConsoleNotificador implements Notificavel {
    @Override public void notificar(String msg) { System.out.println("[NOTIFICAÇÃO] " + msg); }
}

class Aluno {
    private final int id;
    private final String nome;
    Aluno(int id, String nome) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome obrigatório");
        this.id = id;
        this.nome = nome;
    }
    int getId() { return id; }
    String getNome() { return nome; }
    @Override public String toString() { return id + " - " + nome; }
}

class Curso {
    private final String nome;
    private final int vagas;
    private final List<Aluno> matriculados = new ArrayList<>();
    Curso(String nome, int vagas) { this.nome = nome; this.vagas = vagas; }
    String getNome() { return nome; }
    boolean temVaga() { return matriculados.size() < vagas; }
    boolean contem(Aluno a) { return matriculados.contains(a); }
    void adicionar(Aluno a) { matriculados.add(a); }
    List<Aluno> getMatriculados() { return Collections.unmodifiableList(matriculados); }
}

class MatriculaService {
    private final List<Aluno> alunos = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();
    private final Notificavel notificador;
    MatriculaService(Notificavel notificador) { this.notificador = notificador; }

    void cadastrar(Aluno a) { alunos.add(a); }
    void cadastrar(Curso c) { cursos.add(c); } // sobrecarga

    Optional<Aluno> buscarAluno(int id) { return alunos.stream().filter(a -> a.getId() == id).findFirst(); }
    Optional<Curso> buscarCurso(String nome) { return cursos.stream().filter(c -> c.getNome().equalsIgnoreCase(nome)).findFirst(); }

    boolean matricular(int idAluno, String nomeCurso) {
        Aluno a = buscarAluno(idAluno).orElseThrow(() -> new IllegalArgumentException("Aluno não encontrado: " + idAluno));
        Curso c = buscarCurso(nomeCurso).orElseThrow(() -> new IllegalArgumentException("Curso não encontrado: " + nomeCurso));
        if (c.contem(a)) { notificador.notificar(a.getNome() + " já está matriculado em " + c.getNome()); return false; }
        if (!c.temVaga()) { notificador.notificar("Sem vagas em " + c.getNome()); return false; }
        c.adicionar(a);
        notificador.notificar(a.getNome() + " matriculado em " + c.getNome());
        return true;
    }

    // utilitário genérico
    static <T> int contar(Collection<T> itens) { return itens.size(); }
}

public class Exercicio50 {
    public static void main(String[] args) {
        MatriculaService svc = new MatriculaService(new ConsoleNotificador());
        svc.cadastrar(new Aluno(1, "Ana"));
        svc.cadastrar(new Aluno(2, "Bruno"));
        svc.cadastrar(new Aluno(3, "Carla"));
        svc.cadastrar(new Curso("Java", 2));
        svc.matricular(1, "Java");
        svc.matricular(1, "Java");
        svc.matricular(2, "Java");
        svc.matricular(3, "Java");
        try { svc.matricular(9, "Java"); } catch (IllegalArgumentException e) { System.out.println("Erro: " + e.getMessage()); }
        Curso java = svc.buscarCurso("java").orElseThrow();
        System.out.println("Matriculados em Java: " + MatriculaService.contar(java.getMatriculados()) + " " + java.getMatriculados());
    }
}

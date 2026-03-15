import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        alunos = new ArrayList<>();
        avaliacoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        alunos.add(a);
    }

    public void criarAvaliacao(int id, String nome) {
        Avaliacao a = new Avaliacao(id, nome);
        avaliacoes.add(a);
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public String toString() {
        return "Disciplina{id=" + id + ", nome='" + nome + "', professor='" + professor + "', alunos=" + alunos + ", avaliacoes=" + avaliacoes + "}";
    }
}

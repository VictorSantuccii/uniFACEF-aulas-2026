import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao() {
        questoes = new ArrayList<>();
    }

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso) {
        Questao q = new Questao(num, texto, peso);
        questoes.add(q);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public String toString() {
        return "Avaliacao{id=" + id + ", nome='" + nome + "', questoes=" + questoes + "}";
    }
}

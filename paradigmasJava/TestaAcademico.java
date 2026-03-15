public class TestaAcademico {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(1, "Joao", "12345", "ADS");
        Aluno a2 = new Aluno(2, "Maria", "67890", "ADS");

        Disciplina d = new Disciplina(1, "Programacao Orientada a Objetos", "Carlos");

        d.matricularAluno(a1);
        d.matricularAluno(a2);

        d.criarAvaliacao(1, "Prova Semestral");

        Avaliacao av = d.getAvaliacoes().get(0);

        av.adicionarQuestao(1, "Explique POO", 3.0f);
        av.adicionarQuestao(2, "Explique Heranca", 3.5f);
        av.adicionarQuestao(3, "Explique Polimorfismo", 3.5f);

        System.out.println(d);
    }
}

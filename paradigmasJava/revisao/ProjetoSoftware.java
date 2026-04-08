import java.util.*;

class Programador {
    int id;
    String nome;
    String linguagem;

    Programador(int id, String nome, String linguagem) {
        this.id = id;
        this.nome = nome;
        this.linguagem = linguagem;
    }
}

class Projeto {
    int id;
    String nome;
    List<Programador> lista = new ArrayList<>();

    void add(Programador p) {
        lista.add(p);
    }

    void listar() {
        for (Programador p : lista)
            System.out.println(p.nome);
    }
}

public class ProjetoSoftware {
    public static void main(String[] args) {
        Projeto pr = new Projeto();
        pr.add(new Programador(1,"Dev","Java"));
        pr.listar();
    }
}
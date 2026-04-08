import java.util.*;

class Atleta {
    int id;
    String nome;
    String posicao;

    Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }
}

class Time {
    int id;
    String nome;
    String tecnico;
    List<Atleta> atletas = new ArrayList<>();

    void contratarAtleta(Atleta a) {
        atletas.add(a);
    }
}

public class TimeBasquete {
    public static void main(String[] args) {
        Atleta a = new Atleta(1,"Carlos","Armador");
        Time t = new Time();
        t.contratarAtleta(a);
        t = null;
        System.out.println(a.nome);
    }
}
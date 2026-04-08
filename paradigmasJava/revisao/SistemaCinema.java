import java.time.LocalDateTime;
import java.util.*;

class Filme {
    int id;
    String titulo;
    String genero;
    int duracao;

    Filme(int id,String t,String g,int d){
        this.id=id;titulo=t;genero=g;duracao=d;
    }

    public String toString(){
        return titulo;
    }
}

class Ingresso {
    int id;
    String assento;
    String tipo;
    float preco;

    Ingresso(int id,String a,String t,float p){
        this.id=id;assento=a;tipo=t;preco=p;
    }

    public String toString(){
        return assento;
    }
}

class Sessao {
    int id;
    LocalDateTime horario;
    int sala;
    Filme filme;
    List<Ingresso> ingressos = new ArrayList<>();

    Sessao(int id,LocalDateTime h,int sala){
        this.id=id;horario=h;this.sala=sala;
    }

    void vincularFilme(Filme f){
        filme=f;
    }

    void venderIngresso(int id,String a,String t,float p){
        ingressos.add(new Ingresso(id,a,t,p));
    }
}

public class SistemaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme(1,"Batman","Ação",120);
        Filme f2 = new Filme(2,"Duna","Ficção",150);

        Sessao s = new Sessao(1,LocalDateTime.of(2026,7,20,20,0),1);
        s.vincularFilme(f1);

        s.venderIngresso(1,"A1","Inteira",30);
        s.venderIngresso(2,"A2","Meia",15);
        s.venderIngresso(3,"A3","Inteira",30);

        System.out.println(s.filme);
        System.out.println(s.ingressos.size());
    }
}
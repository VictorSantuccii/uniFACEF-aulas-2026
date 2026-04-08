import java.util.*;

class Apartamento {
    int num;
    int andar;

    Apartamento(int num, int andar) {
        this.num = num;
        this.andar = andar;
    }
}

class Edificio {
    String nome;
    String endereco;
    List<Apartamento> aps = new ArrayList<>();

    void construirApartamento(int num, int andar) {
        aps.add(new Apartamento(num,andar));
    }
}

public class EdificioSistema {
    public static void main(String[] args) {
        Edificio e = new Edificio();
        e.construirApartamento(101,1);
        System.out.println(e.aps.size());
    }
}
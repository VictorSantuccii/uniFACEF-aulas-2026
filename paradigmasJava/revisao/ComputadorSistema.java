class Processador {
    String marca;
    String modelo;
    double freq;

    Processador(String marca, String modelo, double freq) {
        this.marca = marca;
        this.modelo = modelo;
        this.freq = freq;
    }
}

class Computador {
    int id;
    String marca;
    Processador p;

    Computador(int id, String marca) {
        this.id = id;
        this.marca = marca;
        this.p = new Processador("Intel","i5",3.2);
    }
}

public class ComputadorSistema {
    public static void main(String[] args) {
        Computador c = new Computador(1,"Dell");
        System.out.println(c.p.modelo);
    }
}
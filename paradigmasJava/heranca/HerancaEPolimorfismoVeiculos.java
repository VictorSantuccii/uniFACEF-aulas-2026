package heranca;

// Classe Pai
class Veiculo {
    protected String marca;
    protected String modelo;
    protected float velocidade;

    public Veiculo(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void mover() {
        System.out.println("Veículo se movendo...");
    }

    public void abastecer() {
        System.out.println("Veículo reabastecendo...");
    }
}

// Classe Filha Aviao
class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeMax + " metros");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }
}

// Classe Filha CarroEletrico
class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida");
    }
}

// Classe Principal
public class HerancaEPolimorfismoVeiculos {
    public static void main(String[] args) {

        Veiculo v;

        v = new Aviao("Boeing", "737", 850, 12000);
        v.mover();

        v = new CarroEletrico("Tesla", "Model 3", 120, 400);
        v.mover();
    }
}

import java.util.Random;

// ================== INTERFACES ==================

interface Autenticavel {
    void validarAcesso(String senha);
}

interface DispositivoLigavel {
    void ligar();
    void desligar();
}

interface SensorTemperatura {
    double lerTemperatura();
}

// ================== CLASSES ==================

class FechaduraEletronica implements Autenticavel, DispositivoLigavel {

    private String senhaCorreta;
    private boolean destravada;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.destravada = false;
    }

    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido.");
            ligar();
        } else {
            System.out.println("Acesso negado.");
        }
    }

    @Override
    public void ligar() {
        destravada = true;
        System.out.println("Fechadura destravada.");
    }

    @Override
    public void desligar() {
        destravada = false;
        System.out.println("Fechadura travada.");
    }
}

class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {

    private boolean ligado;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        if (!ligado) {
            System.out.println("Termostato desligado. Não é possível ler a temperatura.");
            return -1;
        }

        double temperatura = 20 + new Random().nextDouble() * 10;
        System.out.println("Temperatura atual: " + temperatura + "°C");
        return temperatura;
    }
}

// ================== MAIN ==================

public class Main {
    public static void main(String[] args) {

        // Exercício 1: Fechadura Eletrônica
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");
        fechadura.validarAcesso("1234");
        fechadura.desligar();

        System.out.println("------------");

        // Exercício 2: Termostato Smart
        TermostatoSmart termostato = new TermostatoSmart();
        termostato.ligar();
        termostato.lerTemperatura();
        termostato.desligar();
    }
}

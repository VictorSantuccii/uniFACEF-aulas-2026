class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    ArCondicionado() {}

    ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setMarca(String m) {
        if (m != null && m.length() >= 3) {
            this.marca = m;
        }
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
        }
    }

    private boolean verificarCompressor() {
        return Math.random() > 0.2;
    }

    public String toString() {
        return marca + " " + modelo + " | Temp: " + temperatura + " | Ligado: " + ligado;
    }
}

public class SistemaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("LG", "Dual", 22, true);
        ar.ativarModoTurbo();
        System.out.println(ar);
    }
}
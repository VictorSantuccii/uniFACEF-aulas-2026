package heranca;

// Classe Base
class Desenvolvedor {
    protected String nome;
    protected double salario;

    public Desenvolvedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void codar() {
        System.out.println(nome + " está codando...");
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + " | Salário: " + salario;
    }
}

// Junior
class Junior extends Desenvolvedor {

    public Junior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }
}

// Pleno
class Pleno extends Desenvolvedor {

    public Pleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.15;
    }
}

// Senior
class Senior extends Desenvolvedor {

    public Senior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}

// Classe Principal
public class TestePolimorfismoDesenvolvedores {
    public static void main(String[] args) {

        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Ana", 3000);
        devs[1] = new Pleno("Bruno", 6000);
        devs[2] = new Senior("Carlos", 10000);
        devs[3] = new Desenvolvedor("Genérico", 4000);

        for (Desenvolvedor dev : devs) {
            dev.codar();
            System.out.println("Bônus: " + dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println("---------------------");
        }
    }
}

public class Conta {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Conta inativa. Depósito não permitido.");
        }
    }

    public void sacar(float valor) {
        if (!status) {
            System.out.println("Conta inativa.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void encerrarConta() {
        if (saldo == 0) {
            status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar. Saque o saldo antes.");
        }
    }

    public String toString() {
        String situacao = status ? "Ativa" : "Encerrada";
        return "Conta: " + numeroConta +
               "\nAgência: " + agencia +
               "\nCliente: " + nomeCliente +
               "\nSaldo: R$ " + saldo +
               "\nStatus: " + situacao;
    }
}
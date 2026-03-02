public class TestaConta {

    public static void main(String[] args) {

        Conta c1 = new Conta(123, 1, "João Silva");

        c1.depositar(500);
        c1.sacar(200);
        System.out.println("\nEstado da conta c1:");
        System.out.println(c1);

        Conta c2 = new Conta(456, 1, "Maria Souza");

        System.out.println("\nTentando sacar da conta c2:");
        c2.sacar(50);

        System.out.println("\nTentando encerrar c1:");
        c1.encerrarConta();

        c1.sacar(300);
        c1.encerrarConta();

        System.out.println("\nEstado final da conta c1:");
        System.out.println(c1);
    }
}
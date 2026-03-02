public class Streaming {

    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        if (plano.equalsIgnoreCase("Básico")) {
            mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            mensalidade = 60.90f;
        } else {
            mensalidade = 0;
        }

        ativo = true;
        ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Assinatura suspensa. Pague a fatura.");
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";
        return "Usuário: " + usuario +
               "\nPlano: " + plano +
               "\nMensalidade: R$ " + mensalidade +
               "\nStatus: " + status +
               "\nÚltimo filme: " + ultimoFilmeAssistido;
    }
}
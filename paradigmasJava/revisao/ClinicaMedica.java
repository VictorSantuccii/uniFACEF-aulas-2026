import java.time.LocalDateTime;

class Medico {
    int id;
    String nome;
    String especialidade;

    Medico(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }
}

class Paciente {
    int id;
    String nome;
    String cpf;

    Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
}

class Consulta {
    LocalDateTime data;
    double valor;
    Medico medico;
    Paciente paciente;

    Consulta(LocalDateTime data, double valor, Medico m, Paciente p) {
        this.data = data;
        this.valor = valor;
        this.medico = m;
        this.paciente = p;
    }
}

public class ClinicaMedica {
    public static void main(String[] args) {
        Medico m = new Medico(1, "João", "Cardio");
        Paciente p = new Paciente(1, "Maria", "123");
        Consulta c = new Consulta(LocalDateTime.of(2026,5,20,10,0), 200, m, p);
        System.out.println(c.data);
    }
}
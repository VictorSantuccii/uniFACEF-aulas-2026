import java.time.LocalDate;

class Leitor {
    int id;
    String nome;

    Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}

class Livro {
    int id;
    String titulo;
    String autor;

    Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
}

class Emprestimo {
    LocalDate dataEmprestimo;
    LocalDate dataPrevista;
    Leitor leitor;
    Livro livro;

    Emprestimo(LocalDate d1, LocalDate d2, Leitor l, Livro li) {
        dataEmprestimo = d1;
        dataPrevista = d2;
        leitor = l;
        livro = li;
    }

    public String toString() {
        return leitor.nome + " - " + livro.titulo;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Leitor l = new Leitor(1,"Ana");
        Livro li = new Livro(1,"Java","Autor");
        Emprestimo e = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), l, li);
        System.out.println(e);
    }
}
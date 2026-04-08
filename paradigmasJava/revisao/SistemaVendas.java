import java.util.*;

class Produto {
    int id;
    String nome;
    double preco;

    Produto(int id,String nome,double preco){
        this.id=id;this.nome=nome;this.preco=preco;
    }
}

class Cliente {
    int id;
    String nome;

    Cliente(int id,String nome){
        this.id=id;this.nome=nome;
    }
}

class ItemVenda {
    int id;
    int qtd;
    Produto p;

    ItemVenda(int id,int qtd,Produto p){
        this.id=id;this.qtd=qtd;this.p=p;
    }
}

class Venda {
    Cliente c;
    List<ItemVenda> itens = new ArrayList<>();

    Venda(Cliente c){
        this.c=c;
    }

    void addItem(int id,int qtd,Produto p){
        itens.add(new ItemVenda(id,qtd,p));
    }
}

public class SistemaVendas {
    public static void main(String[] args) {
        Produto p = new Produto(1,"Arroz",10);
        Cliente c = new Cliente(1,"João");
        Venda v = new Venda(c);
        v.addItem(1,2,p);
        System.out.println(v.itens.size());
    }
}
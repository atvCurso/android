package sp.senai;

import java.io.Serializable;

public class Produto implements Serializable {

    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        //this.nome = nome;
        //this.quantidade = quantidade;
        //this.preco = preco;
        setNome(nome);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public Produto(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome.length() > 1){
            this.nome = nome;
            return true;
        }
        else{
            return false;
        }

    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean setQuantidade(int quantidade) {
        if(quantidade >= 0){
            this.quantidade = quantidade;
            return true;
        }
        else{
            return false;
        }

    }

    public double getPreco() {
        return preco;
    }

    public boolean setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
            return true;
        }
        else{
            return false;
        }

    }

    public String toString(){
        return nome;
    }
}

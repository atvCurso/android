package sp.senai;

public class Produtos {
        String nome;
        int idade;
        double salario;

    public Produtos(String nome, int idade, double salario) {
        //this.nome = nome;
        //this.idade = idade;
        //this.salario = salario;
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

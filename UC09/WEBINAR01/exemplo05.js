class Livro{
    constructor(pNome, pPreco){
        this.Nome = pNome;
        this.Preco = pPreco;
    }

    get Nome(){ return this.Nome;}
    set Nome(pNome) { this.nome = pNome;}

    get Preco(){ return this.Preco;}
    set Preco(pPreco) { this.preco = pPreco;}

    calcularDesconto(pDesconto){
        this.preco = this.preco - ((this.preco * pDesconto)/100);
    }
}

var obj_livro1 = new Livro("Use a cabeça Java", 200);
obj_livro1.calcularDesconto(15);
console.log("O livro "+obj_livro1.nome+ " custa "+obj_livro1.preco+" reais");
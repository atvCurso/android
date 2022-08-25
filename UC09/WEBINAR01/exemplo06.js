class Livro{
    constructor(pNome, pPreco){
        this.Nome = pNome;
        this.Preco = pPreco;
    }

    get Nome(){ return this.Nome;}
    set Nome(pNome) { this.nome = pNome;}

    get Preco(){ return this.Preco;}
    set Preco(pPreco) { this.preco = pPreco;}

}

var obj_livro1 = new Livro("Use a cabeça Java", 200);
var obj_livro2 = new Livro("Use a cabeça C#", 170);

/*
console.log(obj_livro1.nome);
console.log(obj_livro1.preco);
console.log(obj_livro2.nome);
console.log(obj_livro2.preco);
*/

var lista = [];
lista.push(obj_livro1);
lista.push(obj_livro2);

console.log(lista[0]);
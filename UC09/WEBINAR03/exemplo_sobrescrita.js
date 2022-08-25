class Funcionario{
    constructor (pNome, pSalario){
        this.Nome = pNome;
        this.Salario = pSalario;
    }

    get Nome(){ return this.Nome;}
    set Nome(pNome){ this.nome = pNome;}

    get Salario(){ return this.Salario;}
    set Salario(pSalario){ this.salario = pSalario;}

    calcularSalario(){
        //console.log(this.salario);
        return this.salario;
    }
}

class Vendedor extends Funcionario{
    constructor(pNome, pSalario, pComissao){
        super(pNome, pSalario)
        this.Comissao = pComissao;
    }

    get Comissao(){ return this.Comissao;}
    set Comissao(pComissao){ this.comissao = pComissao;}

    
    calcularSalario(){
        let salario = super.calcularSalario();
        return salario + this.comissao;
    } 
}

class OperadorCaixa extends Funcionario{
    constructor(pNome, pSalario, pBonus){
        super(pNome, pSalario)
        this.Bonus = pBonus;
    }

    get Bonus(){ return this.Bonus;}
    set Bonus(pBonus){ this.bonus = pBonus;}

    calcularSalario(){
        let salario;
        salario = super.calcularSalario();
        return salario + this.bonus;
    } 
}

var obj_vendedor = new Vendedor("Luiz", 1000, 100);
console.log(obj_vendedor.calcularSalario());

var obj_opcaixa = new OperadorCaixa("Jose",2000,300);
console.log(obj_opcaixa.calcularSalario());


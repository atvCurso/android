class Conta{
    constructor(){
        this.saldo = 0;
    }
    get Saldo() {return this.saldo;}
    set Saldo(pSaldo) {this.saldo = pSaldo;}

    imprimir(){
        return "Saldo: " + this.saldo;
    }
}

class Corrente extends Conta{
    constructor (pLimite){
        super();
        this.Limite = pLimite;
    }
    get Limite() {return this.limite;}
    set Limite(pLimite) {this.limite = pLimite;}  

    imprimir(){
        return super.imprimir() +"\nLimite: " + this.limite;
    }
}

var obj_cc = new Corrente(300);
obj_cc.saldo = 1000;
console.log(obj_cc.imprimir());


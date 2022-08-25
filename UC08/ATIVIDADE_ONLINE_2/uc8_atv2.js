let lista = []

let opcao = 's'
while(opcao == 's'){
    let nome = prompt("Digite o nome do participante: ")
    let idade = prompt("Digite a idade do participante: ")
    if (idade > 18){
        if (lista.length < 100){
            console.log("Cadastro permitido!!!")
            lista.push(nome)
        }
        else
            console.log("Cadastro não permitido, pois atingiu o limite máximo de 100")
    }
    else{
        console.log("Cadastro não permitido pela idade.")
    }
    opcao = prompt("Deseja cadastrar outro participante? (s ou n) ")
}

i = 1
while (i < lista.length){
    console.log(lista[i])
    i++
}


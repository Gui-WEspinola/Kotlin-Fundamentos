package fundamentos

class Carro(var cor: String, var anoFabricacao: Int, val dono: Dono){
    override fun toString(): String {
        return "Carro (cor = '$cor', anoFabricacao = $anoFabricacao, dono = $dono)"
    }
}

data class Dono(var nome: String, var idade: Int){
    override fun toString(): String {
        return "Dono (nome = '$nome', idade = $idade)"
    }
}

fun main(){
    var carro = Carro("Branco", 1998, Dono("Guilherme", 29))

    println(carro.cor)
    carro.cor = "Preto"

    println(carro.cor)

    println(carro.dono)

    println(carro)

    println(carro.dono.idade)
    carro.dono.idade = 30
    println(carro.dono.idade)
}
package fundamentos

fun main(){
    var nome = "Guilherme"
    val nomeVal = "Guilherme"

    nome = "Daniel"

    val idade: Int
    idade = 29
    println(idade)

    var array: String
}

class variaveis{
    lateinit var teste: String //designa que o valor de uma variável pode ser designado depois
    // val teste: String //Não pode uma val ser iniciada sem valor fora de uma função

    fun iniciarVariaveis(){
        teste = "teste"
    }
}
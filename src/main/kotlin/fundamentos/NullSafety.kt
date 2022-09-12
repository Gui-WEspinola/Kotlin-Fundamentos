package fundamentos;

fun main(){

    var lista: List<Int?> = listOf(1, 2, null, 4) //lista admitindo valores nulos

    var listaNullable: List<Int>? = null // a própria lista poderá ser nula

    var nome : String? = "Guilherme"

    //elvis operator verifica se um valor é nulo. caso seja, retorna o que está à direita
    var tamanho: Int = nome?.length ?: 0

    // println(nome.length) // O Compilador acusa a possibilidade de null pointer exception
    println(nome?.length) // O Compilador entende que a var pode ser nula, e retornará o valor nulo caso nome o seja.

    println(nome!!.length.toShort())
    //duas exclamações garantem ao compilador que os valores NÃO são nulos

}

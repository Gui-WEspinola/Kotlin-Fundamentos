package fundamentos

fun main(){
    var lista = listOf(1, 2, 3, 4, 5, 6) // inferência de tipo para lista de inteiros LISTA IMUTÁVEL

    val pares = lista.filter { it % 2 == 0 }.first()
    lista.forEach {
        (println(it))
    } //o IT acessa o elemento da vez

    println(pares)

    println(lista[0])
    println(lista.get(0))
    println(lista.indexOf(6))
    println(lista.size)

    var mutableLista = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    mutableLista.add(10)
    println(mutableLista.indexOf(10))
    mutableLista.shuffle()
    println(mutableLista)

    var setNumeros = mutableSetOf(1, 2, 3, 2)
    println(setNumeros.contains(2))
    println("Set de Números: $setNumeros")

    var listaNumeros = listOf(1, 2, 3, 2)
    println("Lista: $listaNumeros")

    var mapNomeIdade = mutableMapOf("Guilherme" to 29, "Vitória" to 26)

    mapNomeIdade["Miu"] = 10 //pode substituir o put
    println("O conjunto de Map é: $mapNomeIdade")

}
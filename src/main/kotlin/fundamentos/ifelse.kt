package fundamentos

fun main(){
    println(parOuImpar(20))
    resultadoNota(6)
    resultadoNota(4)
    resultadoNota(2)
}

fun parOuImpar(numero: Int): String{
    return if (numero % 2 == 0){
        "O número é par"
    } else{
        "O número é ímpar"
    }
}

fun resultadoNota(nota: Int){
    if (nota >= 6){
        println("Passou")
    }else if (nota >= 4){
        println("Recuperação")
    } else {
        println("Reprovou")
    }
}
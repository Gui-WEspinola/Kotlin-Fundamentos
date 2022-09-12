package fundamentos

fun main() {
    dizOi(retornaNome(), 29)
    dizOi(idade = 29, nome = "Guilherme") //é possivel explicitar quais parâmetros estão sendo setados
    dizOi("Daniel")
}

fun retornaNome(): String{
    return "Guilherme"
}

fun dizOi(nome: String, idade: Int = 20){ // ao definir idade = 20, esse será um valor default para o atributo
    println("Oi ${nome}, parabéns pelos seus $idade anos")
}
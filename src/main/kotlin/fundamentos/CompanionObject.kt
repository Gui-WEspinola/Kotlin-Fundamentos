package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    companion object{
        fun criaClasse(): MinhaClasse{
            return MinhaClasse("Guilherme", "Rua Teste", 29)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criaClasse(): SegundaClasse{
        return SegundaClasse("Guilherme", "Rua Teste", 29)
    }
}

fun main(){
    var segundaClasse = SegundaClasse("Nome", "Endereco", 10).criaClasse()
//aqui, seria necessário passar argumentos para criar essa classe.
    var minhaClasse = MinhaClasse.criaClasse()
    //o companion object se assemelha a um método estático.
}
package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Gabriel"
    var cpf:String = "111.111.111-11"
}

fun main() {
    val gabriel:Pessoa = Pessoa()
    println(gabriel.nome)
    println(gabriel.cpf)
}
package one.digitalinnovation.collections

fun main(){
    val joao =Funcionarios("Joao",5000.0,"PJ")
    val maria= Funcionarios("Maria",7500.0,"PJ")
    val ariadne=Funcionarios("Ariadne",1000.0,"CLT")

        val funcionarios = mutableListOf(joao,maria)
        funcionarios.forEach { println(it) }

    println("---------")

    funcionarios.add(ariadne)
    funcionarios.forEach { println(it) }

    println("---------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------SET--------")
    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.add(joao)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("----------")
    funcionariosSet.remove(joao)
    funcionariosSet.forEach { println(it) }

}
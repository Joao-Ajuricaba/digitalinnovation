package one.digitalinnovation.collections

fun main(){
    val joao =Funcionarios("Joao",5000.0)
    val maria= Funcionarios("Maria",7500.0)
    val ariadne=Funcionarios("Ariadne",10000.0)

    val FuncionariosLista = listOf(joao,maria,ariadne)

    FuncionariosLista.forEach {
        println(it)

        println("-----------")


    }
    println(FuncionariosLista.find { it.nome =="Jo" })

}




data class Funcionarios(
    val nome:String,
    val salario:Double = 0.0

) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário : $salario
        """.trimIndent()
    }

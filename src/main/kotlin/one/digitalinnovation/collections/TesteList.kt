package one.digitalinnovation.collections

fun main(){
    val joao =Funcionarios("Joao",5000.0,"PJ")
    val maria= Funcionarios("Maria",7500.0,"PJ")
    val ariadne=Funcionarios("Ariadne",1000.0,"CLT")

    val FuncionariosLista = listOf(joao,maria,ariadne)

    FuncionariosLista.forEach {
        println(it)}

        println("-----------")

    println(FuncionariosLista.find { it.tipoContratacao =="CLT" })

    println("-----------")



    FuncionariosLista
        .groupBy { it.tipoContratacao }
        //.sortedBy { it.salario }
        .forEach{ println(it)}






}




data class Funcionarios(
    val nome:String,
    val salario:Double = 0.0,
    val tipoContratacao:String

) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário : $salario
        """.trimIndent()
    }

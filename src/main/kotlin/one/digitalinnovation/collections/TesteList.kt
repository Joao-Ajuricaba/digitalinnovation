package one.digitalinnovation.collections

fun main(){
    val joao =Funcionarios("Joao",500.0)
    val maria= Funcionarios("Maria",7500.0)
    val ariadne=Funcionarios("Ariadne",100.0)

    val FuncionariosLista = listOf(joao,maria,ariadne)

    FuncionariosLista.forEach {
        println(it)}

        println("-----------")

    println(FuncionariosLista.find { it.nome =="Joao" })

    println("-----------")



    FuncionariosLista
        .sortedBy { it.salario }
        .forEach{ println(it)}




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

package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("João", 5000.0)
    val cesar = Funcionario("César", 4000.0)
    val jeanine = Funcionario("Jeanine", 2000.0)

    val Funcionario = listOf(joao,jeanine,cesar)

    Funcionario.forEach {

        println(it)


    }

    println("---------")

    println(Funcionario.find { it.nome == "João" })




}
data class Funcionario(
    val nome : String,
    val salario : Double

) {
    override fun toString(): String =
        """
            Nome :    $nome
            Salário : $salario
        """.trimIndent()

}


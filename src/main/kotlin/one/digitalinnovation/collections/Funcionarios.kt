package one.digitalinnovation.collections

data class Funcionarios(
    val nome:String,
    val salario:Double = 0.0,
    val tipoContratacao:String

)

{
    override fun toString(): String =
        """
            Nome: $nome
            Salário : $salario
        """.trimIndent()
}

package one.digitalinnovation.collections

fun main(){
     val salarios = doubleArrayOf(1000.0,2350.0,4050.0)

    for (salario in salarios){
        println(salario)

    }

    println("------------")

    println("Maior salário :${(salarios.maxOrNull())}")
    println("Menor salário : ${(salarios.minOrNull())}")
    println("Media salário : ${(salarios.average())}")

    val salarioMaiorque2350 = salarios.filter { it < 2350.0 }

    println("-----------")

    salarioMaiorque2350 . forEach{ println(it)}

}
package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0,2350.0,4050.0)

        for (salario in salarios){
            println(salario)
        }

    println("-----------")

    println("Maior Salário :${salarios.maxOrNull()}")
    println("Maior Salário :${salarios.minOrNull()}")
    println("Maior Salário :${salarios.average()}")

    val SalarioMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("-----------")

    SalarioMaiorQue2500.forEach { println(it) }

    println("-----------")
    println(salarios.count{it in 2000.0..5000.0})

    println("-----------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("-----------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })


}
package one.digitalinnovation.collections

fun main(){
    val joao =Funcionarios("Joao",5000.0,"PJ")
    val maria= Funcionarios("Maria",7500.0,"PJ")
    val ariadne=Funcionarios("Ariadne",1000.0,"CLT")

    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(ariadne)

    val resultUnion = funcionarios1.union(funcionarios2)

    resultUnion.forEach { println(it) }

    println("----------")

    val funcionarios3 = setOf(joao,maria,ariadne)
    val resultSubstract = funcionarios3.subtract(funcionarios2)
    resultSubstract.forEach { println(it) }

    println("----------")

    val resultintersect =funcionarios3.intersect(funcionarios2)
    resultintersect.forEach { println(it) }
}
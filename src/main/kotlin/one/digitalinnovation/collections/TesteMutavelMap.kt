package one.digitalinnovation.collections

fun main(){
    val joao =Funcionarios("Joao",5000.0,"PJ")
    val maria= Funcionarios("Maria",7500.0,"PJ")
    val ariadne=Funcionarios("Ariadne",1000.0,"CLT")

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(ariadne.nome,ariadne)

    println(repositorio.findById(joao.nome))

    println("----------------------")

    repositorio.findAll().forEach { println(it) }

    println("----------------------")

   // repositorio.remove(joao.nome)

    repositorio.findAll().forEach { println(it) }

}
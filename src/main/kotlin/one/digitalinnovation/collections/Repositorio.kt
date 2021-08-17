package one.digitalinnovation.collections

class Repositorio<T> {
    private  val map = mutableMapOf<String,T>()

    fun create(id :String,values: T){
        map[id] = values
    }

    fun findById(id :String) = map[id]

    fun remove(id: String)=map.remove(id)



    fun findAll()= map.values


}
fun main() {
    val java = javatest()
    val name: String? = java.name
    println(name?.length)
}
class KotlinClass(val name: String){
    fun show(){
        println("name is $name")
    }
}
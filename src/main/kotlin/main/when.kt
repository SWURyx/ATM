package main

fun main() {
//    for (i in 10 downTo 1 step 4){
//        print("$i ")
//    }
    val names = arrayOf("joac","asca","sad")
    for (item in names){
        println(item)
    }
    for (i in names.indices){
        println(names[i])
    }
    for ((index,item) in names.withIndex()){
        println("$index-$item")
    }
}
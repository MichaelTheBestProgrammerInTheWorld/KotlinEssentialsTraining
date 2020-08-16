package objectOriented

enum class Directions {

    NORTH, SOUTH, EAST, WEST
}

fun main() {

    val userDir = Directions.NORTH
//    if (userDir == Directions.NORTH){
//        println("the user went to $userDir")
//    }
    println("the user went to $userDir")
}
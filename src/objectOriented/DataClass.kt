package objectOriented

data class Person(val name:String, val age:Int, val gender:Char)

fun main() {

    val person = Person("Michael", 27, 'M')
    println("-----Person Info-----")
    println(person.name)
    println(person.age)
    println(person.gender)
}
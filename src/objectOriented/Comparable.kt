package objectOriented

import java.util.*
import kotlin.collections.ArrayList

class Persons(val name:String, val age:Int): Comparable<Persons> {

    override fun compareTo(other: Persons): Int {
        return this.age - other.age
    }

}

fun main() {

    val listOfPersons = ArrayList<Persons>();
    listOfPersons.add(Persons("Michael", 30))
    listOfPersons.add(Persons("Andrew", 50))
    listOfPersons.add(Persons("Mark", 10))

    println("-----before sorting-----")
    for (person in listOfPersons){
        println(person.name + "  " + person.age)
    }
    Collections.sort(listOfPersons)
    println("-----after sorting-----")
    for (person in listOfPersons){
        println(person.name + "  " + person.age)
    }
}
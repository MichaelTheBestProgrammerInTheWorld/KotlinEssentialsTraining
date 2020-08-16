package objectOriented

class UserAdmins<T>(credit:T) {

    init {
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main() {

    val userAdmins1 = UserAdmins<String>("Michael")
    val userAdmins2 = UserAdmins<Int>(100)
    val userAdmins3 = UserAdmins<Char>('M')
    val userAdmins4 = UserAdmins<Float>(5.5f)

    display<Int>(5)
    display<String>("Michael")
}
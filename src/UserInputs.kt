fun main(){

    print("please enter your name: ")
    val name = readLine()!!.toString()
    print("please enter your age: ")
    val age:Int = readLine()!!.toInt()
    print("please enter your GPA: ")
    val gpa = readLine()!!.toFloat()

    println("===== User Info =====")
    println("name: $name")
    println("age: $age")
    println("GPA: $gpa")
}
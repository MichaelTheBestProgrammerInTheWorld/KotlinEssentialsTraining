fun main(){

    print("Please enter your age:  ")
    val age = readLine()!!.toInt()
    if (age<18){
        println("your age is below minimum")
    } else if (60 > age && age >=18){
        println("you're eligible to join the workforce")
    } else if (age > 60){
        println("you're retired")
    }
    print("Task is done")
}
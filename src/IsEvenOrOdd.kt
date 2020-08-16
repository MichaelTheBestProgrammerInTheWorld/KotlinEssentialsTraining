fun main(){

    print("Please enter a number:  ")
    val num = readLine()!!.toInt()
    if (num % 2 == 0){
        println("number is even")
    } else {
        println("number is odd")
    }
}
fun main(){

    print("Enter X: ")
    var x = readLine()!!.toInt()
    print("Enter Y: ")
    var y = readLine()!!.toInt()

    x = x+y
    y = x-y
    x = x-y

    println("swapped numbers are:")
    println("x equals $x")
    println("y equals $y")
}
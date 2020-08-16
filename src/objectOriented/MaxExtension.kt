package objectOriented

fun ArrayList<Int>.findMax():Int{
    var maxNum = 0;
    for (item in this){
        if (item > maxNum){
            maxNum = item
        }
    }
    return maxNum
}

fun main(){

    val listOfElements = arrayListOf<Int>()
    listOfElements.add(3)
    listOfElements.add(5)
    listOfElements.add(8)
    listOfElements.add(10)
    listOfElements.add(26)
    listOfElements.add(13)

    for (item in listOfElements){
        println(item)
    }

    println("Max Number is ${listOfElements.findMax()}")
}
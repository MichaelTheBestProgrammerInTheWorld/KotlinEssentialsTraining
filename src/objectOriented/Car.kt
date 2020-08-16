package objectOriented

open class Car(val brand:String, val model:Int, val price:Int, val milesDriven:Int) {

    init {
        println("new car object has been created")
    }

    fun getSellPrice():Int {

        return price-(milesDriven*10)
    }
}

fun main(){

    val car1 = Car("Mercedes", 2020, 20000, 50)
    val car2 = Car("BMW", 2019, 10000, 150)

    val listOfCars = arrayListOf<Car>()
    listOfCars.add(car1)
    listOfCars.add(car2)

    for (car in listOfCars){
        println("----------")
        println(car.brand)
        println(car.getSellPrice())
    }
}
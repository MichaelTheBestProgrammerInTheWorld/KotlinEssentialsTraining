package objectOriented

open class Vehicle() {

    var brand:String? = null
    var model:Int? = null
    var price:Int? = null

    constructor(brand:String, model:Int, price:Int):this(){
        this.brand = brand
        this.model = model
        this.price = price
    }

    constructor(brand:String, model:Int):this(){
        this.brand = brand
        this.model = model
    }
}

fun main(){

    val vehicle1 = Vehicle("Mercedes", 2020, 20000)
    val vehicle2 = Vehicle("BMW", 2019)

    val listOfVehicles = arrayListOf<Vehicle>()
    listOfVehicles.add(vehicle1)
    listOfVehicles.add(vehicle2)

    for (car in listOfVehicles){
        println("----------")
        println(car.brand)
        println(car.price)
    }
}
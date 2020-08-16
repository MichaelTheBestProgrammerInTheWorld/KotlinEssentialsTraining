package objectOriented

class Truck:Vehicle {

    var type:String? = null

    constructor(brand:String, model:Int, price:Int, type:String):super(brand, model, price){
        this.type = type;
    }

    constructor(brand:String, model:Int, type:String):super(brand, model){
        this.type = type;
    }
}

fun main(){

    val truck1 = Truck("Mercedes", 2020, 20000, "ambulance")
    val truck2 = Truck("BMW", 2019, "school bus")

    val listOfTrucks = arrayListOf<Truck>()
    listOfTrucks.add(truck1)
    listOfTrucks.add(truck2)

    for (truck in listOfTrucks){
        println("----------")
        println(truck.brand)
        println(truck.price)
        println(truck.type)
    }
}
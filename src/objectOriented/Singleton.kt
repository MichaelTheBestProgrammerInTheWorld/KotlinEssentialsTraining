package objectOriented

class Singleton {

    var name:String?= null

    private constructor(){
        println("Instance is created")
    }

    companion object{

        val instance:Singleton by lazy { Singleton() }
    }
}

fun main() {

    var s1 = Singleton.instance
    s1.name = "Michael"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)

    var s3 = Singleton.instance
    println(s3.name)
}
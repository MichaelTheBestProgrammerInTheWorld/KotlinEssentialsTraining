package multiThreading

fun main() {

    val t1 = MyThread("first thread")
    t1.start()

    val t2 = MyThread("second thread")
    t2.start()
//    var count = 0
//    while (count < 100){
//        println("Michael")
//        count++
//    }
}

class MyThread():Thread() {

    var myThreadName:String = ""

    constructor(myThreadName:String):this(){
        this.myThreadName = myThreadName
    }

    override fun run() {
        super.run()

        var count = 0
        while (count < 100){

            println(myThreadName + "   " + count)
            count++
            try {
                sleep(1000)
            } catch (ex:Exception){
                ex.message
            }
        }

    }
}

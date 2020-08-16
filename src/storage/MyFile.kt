package storage

import java.io.FileReader
import java.io.FileWriter

fun main() {

    readFromFile()
    println("what do you want to write in the file?")
    writeToFile(readLine().toString())
}

fun writeToFile(s: String) {

    try {
        var file = FileWriter("test.txt", true)
        file.write(s + "\n")
        file.close()
        println("app is done")
    } catch (ex:Exception){
        println(ex.message)
    }
}

fun readFromFile(){

    try {
        var file = FileReader("test.txt")
        var c:Int?
        do {
            c = file.read()
            print(c.toChar())
        }while (c != -1)
    } catch (ex:Exception){
        ex.message
    }
}

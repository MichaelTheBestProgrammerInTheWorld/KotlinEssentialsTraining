package objectOriented

interface CreditCard {

    val  cardNum:String

    fun score(age:Int)
}

class MasterCard(override val cardNum: String):CreditCard {

    override fun score(age: Int) {
        if (age > 50){
            println("Score is Negative")
        } else {
            println("Score is Positive")
        }
    }

}

class Visa(override val cardNum: String):CreditCard {

    override fun score(age: Int) {
        if (age > 60){
            println("Score is Negative")
        } else {
            println("Score is Positive")
        }
    }

}

class Paypal(client:CreditCard):CreditCard by client

fun main() {

    val masterCard = MasterCard("123456")
    masterCard.score(55)

    val visa = Visa("654321")
    visa.score(55)

    val paypal1 = Paypal(masterCard)
    println("card number is ${paypal1.cardNum}")

    val paypal2 = Paypal(visa)
    println("card number is ${paypal2.cardNum}")
}
import kotlin.random.Random

fun main(){
    var RandomNumber = Random.nextInt(0,10)
    var guessatt = 0
    while (true){
        println("Enter your number here: ")
        var userguess = readLine()!!.toInt()
        if (RandomNumber > userguess){
            println("The number is too low")
            guessatt += 1
        }else if(RandomNumber < userguess){
            println("The number is too high")
            guessatt += 1
        }else if(RandomNumber == userguess){
            println("You got the number $RandomNumber / $userguess")
            println("You got this in this many attem $guessatt")
            break
        }
    }
}
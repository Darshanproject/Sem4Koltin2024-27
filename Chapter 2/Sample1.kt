fun main() {
    var i: Boolean = false
    while (!i) {
        println("do you want to exit? (true/false)")
        i = readLine()?.toBoolean() ?: false
        if(i == true){
            break
        }else{
            println("You chose to continue")
        }
        println("This is my while loop")
        
    }
    // var i:Int = 0
    // for(i in 1..10) {
    //     if(i%2 == 0){
    //         continue
    //     }else{
    //         println("This is my for loop number $i")
    //     }
        
    // }
    // do {
    //     println("This is my do while loop number $i")
    //     i++
    // } while (i <= 10)
}
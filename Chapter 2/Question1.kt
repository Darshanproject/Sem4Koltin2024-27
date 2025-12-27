fun main(){
    var isCompleted = false
    var sum = 0
    var GST = 0
    println("Welcome to Maharaja Hotel")
    while (!isCompleted){
        println("1 Pizza 120")
        println("2 Pasta 160")
        println("3 Cold Coffe 80")
        println("4 Dabeli 60")
        println("What do you like to order")
        var option = readLine()!!.toInt()
        println("How many plates or pcs do you want?")
        var qty = readLine()!!.toInt()

        if (option == 1){
            if(qty >= 1){
                sum += qty*120
            }
        }else if(option == 2){
            if (qty >= 1){
                sum += qty*160
            }
        }else if(option == 3){
            if (qty >= 1){
                sum += qty*80
            }
        }else if(option == 4){
            if (qty >= 1){
                sum += qty*60
            }
        }
        println("Would you like to order anything else?")
      var  answer = readLine()
        if (answer == "yes" || answer == "YES"){
            isCompleted = false
        }else{
            isCompleted = true
            GST = sum%18
            println("Total Price = $sum")
            println("This is your amout with gst ${sum+GST}")
            println("This is your total payable amout ${sum+GST}")
        }
        println("Thank your for visiting our hotel")
    }
}
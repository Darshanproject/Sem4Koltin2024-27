fun main() {
    var myList = listOf(1,2,3,4,5,6,7,8,9)
    myList.add(12)
    println("This is your list $myList")
    println("This is your updated List $myList")
    println(myList::class.java)
}
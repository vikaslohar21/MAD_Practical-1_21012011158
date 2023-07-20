package `practical-1`

fun main ()
{
    println("Enter a number: ")
    val number = readLine()!!.toInt()

    if (number % 2 ==0){
        println("$number is even")
    }
    else {
        println("$number is odd")
    }
}
package `practical-1`

fun main ()
{
    print("Enter a number for factorial : ")
    val num = readLine()!!.toInt()
    val factorial = fact(num)
    println("Factorial of $num = $factorial")

}
fun fact (num : Int):Long
{
    if (num >= 1)
        return num * fact(num - 1)
    else
        return 1
}

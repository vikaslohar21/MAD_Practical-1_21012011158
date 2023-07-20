package `practical-1`

fun main ()
{
    print("Enter first Number  : ")
    val number1 = readLine()!!.toInt()

    print("Enter second Number  : ")
    val number2 = readLine()!!.toInt()

    print("Enter third Number  : ")
    val number3 = readLine()!!.toInt()

    println("Addition of Numbers :  ${addition(number1,number2,number3)}")
    println("Subtraction of Numbers : ${subtraction(number1,number2,number3)}")
    println("Multiplication of Numbers :  ${multiplication(number1,number2,number3)}")
    println("Division of Numbers : ${division(number1,number2,number3)}")


}

fun addition (number1: Int, number2:Int, number3: Int ): Int  {
    return number1 + number2 + number3
}
fun subtraction (number1: Int, number2:Int, number3: Int ): Int  {
    return number1 - number2 - number3
}
fun multiplication (number1: Int, number2:Int, number3: Int ): Int  {
    return number1 * number2 * number3
}
fun division (number1: Int, number2:Int, number3: Int ): Int  {
    return number1 + number2 + number3
}



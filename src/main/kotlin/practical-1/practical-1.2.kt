package `practical-1`

fun main (){

    // Type conversion
    val integerValue = 10
    println("Integer value : $integerValue")

    val integerToDouble = integerValue.toDouble()
    println("Double valur (From Integer) : $integerToDouble")

    val stringValue = "10"
    println("String Value : $stringValue")

    val stringToInteger1 = stringValue.toInt()
    println("Integer value1 (From String) : $stringToInteger1")

    val stringToInteger2 = stringValue.toInt()
    println("Integer value2 (From String) : $stringToInteger2")

    val stringToDouble = stringValue.toDouble()
    println("Double Value (from String) : $stringToDouble")


}


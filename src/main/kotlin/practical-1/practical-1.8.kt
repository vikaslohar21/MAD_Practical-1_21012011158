package `practical-1`

fun main ()
{
    println("Create Array-1 by using arrayOf() method:")
    var array1 =arrayOf(12,45,63,12,8)
    println(array1.contentDeepToString())

    println("Create Array-2 by using Array<>():")
    var array2 = Array<Int>(5){0}
    println(array2.contentDeepToString())

    println("Create Array-3 using Array<>() and lambda function:")
    var array3 = Array<Int>(8){i: Int -> i}
    println(array3.contentDeepToString())

    println("Create Array-4 by using IntArray():")
    var array4 = IntArray(5) //{i: Int -> i}
    println(array4.contentToString())

    println("Create Array-5 by using intArrayOf():")
    var array5 = intArrayOf(12,23,21,3,13)
    println(array5.joinToString {""})


}


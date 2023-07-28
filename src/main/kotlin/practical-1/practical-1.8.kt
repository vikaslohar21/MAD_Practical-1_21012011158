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
    println(array4.joinToString())

    println("Create Array-5 by using intArrayOf():")
    var array5 = intArrayOf(12,23,21,3,13)
    println(array5.joinToString())

    println("Print 2-D Array-6 by using arrayOf() and intArrayOf() : ")
    var array6 = arrayOf(intArrayOf(5,2),intArrayOf(7,6),intArrayOf(9,5))
    println(array6.contentDeepToString())

    println("Please enter Array Size : ")
    var size : Int = readLine()!!.toInt()
    println("Please enter Array value : ")
    var user = IntArray(size) {0}

    for (i in 0 until size)
    {
        print("a[$i]:")
        user[i] = readLine()!!.toInt()
    }
    println("Entered array :")
    println(user.contentToString())

    println()
    println("*********************** With Built-in Function ***********************")
    println("After sorting by Built-in Function : ")
    user.sort()
    println(user.joinToString())

    println("*********************** Without Built-in Function ***********************")
    bubbleSort(user)
    println("After Sorting without built-in function : ")
    println(user.joinToString())
}

fun bubbleSort(user : IntArray)
{
    var n = user.size
    for (i in 0 until n-1)
    {
        for (j in 0 until n-i-1)
        {
            if (user [j] > user[j+1])
            {
                var temp = user[j]
                user[j] = user[j+1]
                user[j+1] = temp
            }
        }
    }
}






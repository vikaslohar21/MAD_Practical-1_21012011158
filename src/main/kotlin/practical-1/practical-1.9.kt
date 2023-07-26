package `practical-1`

fun main ()
{

    print("Enter Elements : ")
    val n:Int = readLine()!!.toInt()
    val array = ArrayList<Int>()
    var maxnum = 0

    for (i:Int in 0 until n)
    {
        print("a[$i] = ")
        array.add(i,readLine()!!.toInt())
        if (maxnum<array[i])
        {
            maxnum = array[i]
        }
    }

    println()
    println("Largest element from  Array Without in-built Function = $maxnum")
    println("Largest element from Array With in-built Function = ${array.max()}")
}
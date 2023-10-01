package `practical-1`

fun main (){
    print("Enter Student Enrollment no : ")
    var enrollment = readLine()!!

    print("Enter Student's Name : ")
    var studentName = readLine()!!

    print("Enter Student's Branch :")
    var branch = readLine()!!

    print("Enter Student's Class :")
    var studentClass = readLine()!!

    print("Enter Student's batch : ")
    var batch = readLine()!!

    print("Enter Student's College Name :")
    var collegeName = readLine()!!

    print("Enter Student's University Name :")
    var universityName = readLine()!!

    print("Enter Student's Age :")
    var age = readLine()!!

    println("****************   Student Information    ****************")

    var string1 : Long = enrollment.toLong()
    println("Enrollment No : ${string1}")

    var string2 :String = studentName.toString()
    println("Name : ${string2}")

    var string3 : String = branch.toString()
    println("Branch: ${string3}")

    var string4 : String = studentClass.toString()
    println("Class: ${string4}")

    var string5 :String = batch.toString()
    println("Batch: ${string5}")

    var string6 : String = collegeName.toString()
    println("College: ${string6}")

    var string7 : String = universityName.toString()
    println("University: ${string7}")

    var string8 : Int = age.toInt()
    println("Age: ${string8}")

}
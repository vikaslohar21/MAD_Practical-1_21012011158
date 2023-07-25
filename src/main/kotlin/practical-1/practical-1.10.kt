package `practical-1`


//class Student <String>(var name :String, var en : String)
//{
////    override fun toString(): kotlin.String {
////        return super.toString()
////    }
//    var studentName : String = name
//    var enrollNo : String = en
//
//    init {
//        println("This is init class!")
//    }
//}

class student (var firstName : String, var lastName: String):Person(firstName,lastName)
{
    var name : String = firstName+ " " +lastName
}
fun main()
{
//     var stu1 = Student  ("Vikas Lohar","21012011158")
//     println(stu1.name)
//     println(stu1.en)
}
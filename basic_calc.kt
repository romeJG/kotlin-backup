import java.util.Scanner

fun main() {
    val scnr = Scanner(System.`in`)
    print("+, -, *, /, % \noprtr: ")
    var ope = scnr.nextLine()
    print("val 1: ")
    var val1 = scnr.nextInt()
    print("val 2: ")
    var val2= scnr.nextInt()
    when (ope){
        "+" -> println(printSum(val1,val2))
        "-" -> println(printSub(val1,val2))
        "*" -> println(printProduct(val1,val2))
        "/" -> println(printDiv(val1,val2))
        "%" -> println(printMod(val1,val2))
        else -> print("$ope is not a valid operator try using + - * /")
    }
}
fun printSum(a: Int, b: Int) = "Sum of $a and $b is  ${a+b}"      
fun printSub(a: Int,b: Int) = "$a subtracted to $b is  ${a-b}"
fun printProduct(a: Int,b: Int) = "Product of $a and $b is  ${a*b}"
fun printDiv(a: Int,b: Int) = println("$a Divided to $b is  ${a/b}"
fun printMod(a: Int,b: Int) = println("$a Modulo  $b is  ${a%b}"   

// fun main() {
//     println("Hello, Tamaraws\n")
// }
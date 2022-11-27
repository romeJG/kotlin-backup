import java.util.Scanner
fun main() {
  val scnr = Scanner(System.`in`)
  val str = scnr.nextLine()
  val arr = str.toStringArray()// makes the str to an array
println(arr.sorted().joinToString(""))//makes the array alphabetical and make it a string
}
//by justine guillermo :DD

import java.util.Scanner
fun main() {
  val scnr = Scanner(System.`in`)
  var arr = Array<Int>(3){0}
  print("Enter 1st Number: ")
  arr[0] = scnr.nextInt()
  print("Enter 2nd Number: ")
  arr[1]= scnr.nextInt()
  print("Enter 3rd Number: ")
  arr[2]= scnr.nextInt()
  println("The highest value from "+arr[0]+", "+arr[1]+", "+arr[2]+" inputted numbers is "+arr.max())
}
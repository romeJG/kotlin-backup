import java.util.Scanner
fun sum(x: Int, y: Int){
  if (x>y||0>x||0>y){
    println("Invalid")
    return
  }
  var sum = 0
  for (i in x..y) {
    sum+=i
  }
  println(sum)
}
fun main(){
  val scnr = Scanner(System.`in`)
  val x = scnr.nextInt()
  val y = scnr.nextInt()
  sum(x,y)
}
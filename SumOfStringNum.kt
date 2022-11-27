import java.util.Scanner
fun main() {
  val scnr = Scanner(System.`in`)
  var num = scnr.nextLine()
  var sum = 0
  for (i in num){
    sum+=(i.toInt())-48//kasi pag nag toInt ako nag + 48 wierd af
  }
  print("$sum "+"%.2f".format(sum/num.length.toDouble()))
}
//by justine guillermo



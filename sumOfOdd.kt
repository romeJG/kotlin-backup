fun sumOfOdd(isOdd: Boolean, a: Int){
  var sum=0
  if (isOdd){
    for (i in 1..a step 2){
    sum+=(i.toInt())
    }
    println("The sum of odd numbers from 1 to $a is $sum")
  }else{
    for (i in 2..a step 2){
    sum+=(i.toInt())
    }
    println("The sum of even numbers from 1 to $a is $sum")
  }
}
fun main(){
    print("Enter a number:")
    val a = rdInt()
    print("Display the sum of odd numbers[Y/N]:")
    val choice = rd()
    var isOdd = false
    if(choice.equals("Y")) isOdd = true
    sumOfOdd(isOdd, a)
}

private fun rd() = readLine()!!//gusto ko na mamatai
private fun rdInt() = rd().toInt()


fun myProd(isOdd: Boolean, vararg input: Char){
var prod=1
  for(i in input){
    if(i >= 'a' && i <= 'z' || i >= 'A' && i <= 'Z' || i=='0'){//checks if char is a letter  
    
    }else{
      if(isOdd){
          if(!(i.toInt()%2==0)){
            prod*=Character.getNumericValue(i)
          }
      }else{
          if(Character.getNumericValue(i)%2==0){
            prod*=Character.getNumericValue(i)
          }
      }
    }
  }
print("The product is $prod")
}

fun main(){
    print("Enter a number string of digits: ")
    val input = rd()
    print("Display the product of odd digit numbers [Y/N]: ")
    val choice = rd()
    var isOdd = false
    if(choice.equals("Y")) isOdd = true
    myProd(isOdd,*input.toCharArray())
    
}


private fun rd() = readLine()!!
private fun rdInt() = rd().toInt()
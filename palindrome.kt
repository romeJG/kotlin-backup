fun main(){
    print("Enter a string: ")
    val str = rd()
    val isPalindrome = ::myFunc //replace with anonymous function
    if(isPalindrome(str)){
        print("$str is palidrome")
    } else {
        print("$str is not palidrome")
    }
}

//remove this function and replace with anonymous function
fun myFunc(stri: String): Boolean{
   var str = stri.replace("\\s".toRegex(), "")
   val sb = StringBuilder(str)
    //reverse the string
    val reverseStr = sb.reverse().toString()
    //compare reversed string with input string
    return str.equals(reverseStr, ignoreCase = true)
}

private fun rd() = readLine()!!
private fun rdInt() = rd().toInt()
import java.util.Scanner
fun isPalindromeString(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)
    val reverseStr = sb.reverse().toString()
    return inputStr.equals(reverseStr, ignoreCase = true)
}
fun main() {
    val sc = Scanner(System.`in`)
    val inString: String = sc.nextLine()
    if (isPalindromeString(inString)) {
        println("\"$inString\"" + " is a palindrome")
    } else {
        println("\"$inString\""+ " is not a palindrome")
    }
}
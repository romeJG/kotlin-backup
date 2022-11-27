fun main(){
    print("Enter some string: ")
    val str = readLine()
    var noOfVowels = 0
    str.forEach{c ->
        when(c) {
            'a', 'e', 'i', 'o', 'u' -> noOfVowels++
        }
    }
    println("There are ${noOfVowels} vowel(s)")
}

private fun rd() = readLine()!!
private fun rdInt() = rd().toInt()
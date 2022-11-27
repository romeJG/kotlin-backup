fun main(){
    print("Enter some string: ")
    val str = rdLn()
    //my code
    val vowels = str.filter {
      it == 'a' ||it == 'e' ||it == 'i' ||it == 'o' ||it == 'u'
    }
    val consonants = str.filter {
      (!(it == 'a' ||it == 'e' ||it == 'i' ||it == 'o' ||it == 'u'||it==' '))&&(it >= 'a' && it <= 'z' || it >= 'A' && it <= 'Z')
    }
    //end of my code
    println("Vowels: $vowels")
    println("Consonants: $consonants")
}


private fun rdLn() = readLine()!!
private fun rdInt() = rdLn().toInt()
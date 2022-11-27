fun main() {
    val s = "Test@@String#123"
 
    val result = s.filter { it.isLetterOrDigit() }
    println(result)
}
fun main() {
    greetBavarianIO()
}

fun greetBavarianIO(): Unit {
    println("Wie heißt du?")
    val name = readln()
    println("Servus " + name)
}

fun f(x:Int) = x * x

val y:List<List<Int>> = listOf(listOf(1, 3), listOf(2, 45))
val z:List<Int> = listOf(5, 1)
//val x:List<List<Int>> = y + z
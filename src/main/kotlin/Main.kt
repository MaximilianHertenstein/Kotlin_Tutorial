import java.util.*


fun main() {
    for (i in 0..2) {
        println(i)
    }
}


fun maps(x: IntArray): IntArray {
    var result: List<Int> = listOf()
    for (i in x) {
        result = result + listOf(2 * i)
    }
    return result.toIntArray()
}


fun points(games: List<String>): Int {
    var acc = 0
    for (game in games) {
        acc = acc + when {
            game[0] > game[2] -> 3
            game[0] == game[1] -> 1
            else -> 0
        }
    }
    return acc
}

fun juggleMotivationMuchBetter(count: Int): Unit {
    when {
        count >= 15 -> {
            println("Great,")
            println("add another ball!")
        }

        count >= 3 -> {
            println("Try again,")
            println("until you got 15 repetitions!")
        }
    }
}

fun price(amount: Int, pricePerUnit: Int, discount: Boolean): Int =
    if (discount) {
        val reducedPricePerUnit = pricePerUnit - 1
        reducedPricePerUnit * amount
    } else pricePerUnit * pricePerUnit


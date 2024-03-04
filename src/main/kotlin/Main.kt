package org.example

fun threeSum(numbers: IntArray): List<Int> {
    val result = mutableListOf<Int>()

    numbers.forEachIndexed { index, number ->
        if(numbers.size > index + 2) {
            var i = index + 1
            while (i in index + 1 until numbers.size && result.isEmpty()) {
                var j = index + 2
                while (j in index + 2 until numbers.size && result.isEmpty()) {
                    if(numbers[i] + numbers[j] == -number) {
                        result.addAll(listOf(number, numbers[i], numbers[j]))
                    }
                    j++
                }
                i++
            }
        }
    }

    return result
}

fun main() {
    data.forEach { numbers ->
        val triplets = threeSum(numbers)
        println("Triplets that sum up to zero: $triplets")
    }
}

val data = listOf(
    intArrayOf(-1, 0, 1, 2, -1, -4),
    intArrayOf(-1, 2, 1, 2, -1, -4),
    intArrayOf(-4, -1, -2, -1, 2, 2),
    intArrayOf(-3, -1, -1, -1, 2, 2)
)
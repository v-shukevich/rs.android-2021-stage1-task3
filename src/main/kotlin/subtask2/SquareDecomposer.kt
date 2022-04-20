package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose(square(number),number-1)
    }

    private fun decompose(numberSqr: Int, startNumber: Int): Array<Int>? {
        for (i in startNumber downTo 1) {
            val reminder = numberSqr - square(i)
            when {
                reminder == 0 -> return arrayOf(i)
                reminder < 0 -> return null
                else -> {
                    var nextNumber = kotlin.math.sqrt(reminder.toDouble()).toInt()
                    if (nextNumber >= i) nextNumber = i - 1
                    val result = decompose(reminder, nextNumber)
                    if (result != null) return result + arrayOf(i)
                }
            }
        }
        return null
    }

    private fun square(i: Int) = i * i
}

package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val targetBinomC = array[0]
        val n = array[1]
        var k = 1
        while (k < n){
            val currentBinomC = binomC(n,k)
            if (currentBinomC == targetBinomC) return k
            k++
        }
        return null
    }

    fun factorial(n: Int): Double {
        var result = 1.0
        for (i in 1..n) {
            result *= i
        }
        return result
    }

    fun binomC(n: Int, k: Int): Int {

        return (factorial(n) / (factorial(k) * factorial(n - k))).toInt()

    }
}

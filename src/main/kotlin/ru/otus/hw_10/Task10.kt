package ru.otus.hw_10

class Task10<T> {

    //    Task 1
    fun functionRepeat(lambdaInput: () -> T, n: Int) {
        if (n < 0) throw RuntimeException()
        for (i in 0..n) {
            lambdaInput()
        }
    }

    fun functionRepeat(min: Int, max: Int, lambdaInput: () -> T) {
        for (i in min..max) {
            lambdaInput()
        }
    }

    //    Task 2
    fun mainF(inputFunction: () -> T): T {
        println(System.currentTimeMillis())
        return inputFunction()
            .also { println(System.currentTimeMillis()) }
    }

    //    Task 3
    fun knapsack(weightsFunction: () -> IntArray, costsFunction: () -> IntArray, neededFunction: () -> Int): Int {
        val n = weightsFunction().size
        val dp = Array(neededFunction() + 1) { IntArray(n + 1) }

        for (j in 1..n) {
            for (w in 1..neededFunction()) {
                val el1 = dp[w][j - 1]

                if (weightsFunction()[j - 1] <= w) {
                    val el2Cost = costsFunction()[j - 1]
                    val el2 = dp[w - weightsFunction()[j - 1]][j - 1]

                    dp[w][j] = el1.coerceAtLeast(el2 + el2Cost)
                } else {
                    dp[w][j] = el1
                }
            }
        }
        return dp[neededFunction()][n]
    }
}
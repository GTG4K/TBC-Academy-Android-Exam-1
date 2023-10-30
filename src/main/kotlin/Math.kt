class Math() {
    public fun largestCommonDivisor(number1: Int, number2: Int): Int{
        val smallestNumber = minOf(number1, number2);
        var divisor = 1;
        for (i in 1..smallestNumber){
            if(number1 % i == 0 && number2 % i == 0) divisor = i
        }
        return divisor
    }

    public fun smallestCommonMultiple(number1: Int, number2: Int): Int{
        return kotlin.math.abs(number1 * number2)/ largestCommonDivisor(number1, number2)
    }

    public fun ifHasDollar(inputString: String): Boolean {
        return inputString.contains("\\$")
    }

    public fun sumOfFirst100(n: Int = 100): Int {
        return if (n == 1) {
            1
        } else {
            n + sumOfFirst100(n - 1)
        }
    }

    public fun returnReverseOfInt(number: Int): Int{
        val reversedString = number.toString().reversed()
        val stringWithoutZeros = reversedString.trimStart('0')

        return stringWithoutZeros.toInt()
    }

    public fun stringIsPalindrome(inputString: String): Boolean{
        return inputString.reversed() == inputString;
    }
}
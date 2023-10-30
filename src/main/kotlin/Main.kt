fun main(args: Array<String>) {
    println(largestCommonDivisor(12,18))
    println(smallestCommonMultiple(12, 18))
    println(ifHasDollar("hghdg$ hfh"))
    println(sumOfFirst100(100))
    println(returnReverseOfInt(12345))
    println(stringIsPalindrome("abbbbc"))
    println(stringIsPalindrome("abbbba"))
}

fun largestCommonDivisor(number1: Int, number2: Int): Int{
    val smallestNumber = minOf(number1, number2);
    var divisor = 1;
    for (i in 1..smallestNumber){
        if(number1 % i == 0 && number2 % i == 0) divisor = i
    }
    return divisor
}

fun smallestCommonMultiple(number1: Int, number2: Int): Int{
    return kotlin.math.abs(number1 * number2)/ largestCommonDivisor(number1, number2)
}

fun ifHasDollar(inputString: String): Boolean {
    return inputString.contains("\\$")
}

fun sumOfFirst100(n: Int = 100): Int {
    return if (n == 1) {
        1
    } else {
        n + sumOfFirst100(n - 1)
    }
}

fun returnReverseOfInt(number: Int): Int{
    val reversedString = number.toString().reversed()
    val stringWithoutZeros = reversedString.trimStart('0')

    return stringWithoutZeros.toInt()
}

fun stringIsPalindrome(inputString: String): Boolean{
    return inputString.reversed() == inputString;
}
fun calculateEvenDigits(input:String): Int {
    var sum: Int = 0
    var temp: Int = 0
    for (x in input){
        if (temp % 2 == 0) sum +=temp

    }
    return sum
}
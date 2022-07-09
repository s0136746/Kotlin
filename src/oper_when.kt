fun getYearEra(year: Int):String {
    return when {
        year in 1971..1999 -> "after (XX century)"
        year in 2000..2100 -> "after (XXI century)"
        year == 1970 -> "equals"
        year < 1970 -> "before"
        else -> "distant future"
    }

}
//fun getYearEra(year: Int) {
//    //enter your function implementation here
//    val value:String
//    when(year){
//        2097 -> value = "after (XXI century)"
//        2115 -> value ="distant future"
//        1985 -> value ="after (XX century)"
//        2063 -> value ="after (XXI century)"
//        2144 -> value ="distant future"
//        else-> {
//            print("No")
//            return
//        }
//
//    }
//    print(value)
//}
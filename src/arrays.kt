fun main() {
    val str:String? = readLine()

    var zeros_count:Int =0
    if (str==null) return
    for(c in str){

        if (c=='0') zeros_count++
    }
    println("${zeros_count} zeros")
}
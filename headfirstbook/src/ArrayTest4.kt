fun main(){
    val fruit = arrayOf("Apple,", "Banana","Cherry","Blueberry", "Pomegranate")
    val index = arrayOf(1,3,4,2)
    var x = 0
    while(x<4){
        var y: Int = index[x]
        println("Fruit=${fruit[y]}")
        x=x+1
    }

}
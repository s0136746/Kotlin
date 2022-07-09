class DrumKit(var hasTopHat: Boolean, var hasSnare:Boolean){
    fun playTopHat(){
    if (hasTopHat) println("ding ding ba-da-ding!")
    }
    fun playSnare(){
        if (hasSnare) println("bang bang bang!")
    }
}
fun main(){
    val d = DrumKit(true,true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare=false
    d.playTopHat()
    d.playSnare()
}
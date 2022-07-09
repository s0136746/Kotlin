class DVDPlayer(var hasRecorder: Boolean){

    fun recordDVD(){
        if (hasRecorder){
            println("DVD recording")
        }
    }
    fun playDVD(){
        if (hasRecorder){
            println("DVD is played")
        }
    }
}
fun main(){
    val d = DVDPlayer(true)
    d.playDVD()
    d.recordDVD()
}
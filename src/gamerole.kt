class player(var str:Int = 0, var dex: Int = 0, var XP:Int=0, var lvl: Int=1, var nextLvlXP: Int = 10){
    fun recieveXP(xp: Int){
        XP+=xp
        if(XP>=nextLvlXP) lvlUP()
        println("str = ${str} dex = ${dex} lvl = ${lvl}")
    }
    private fun lvlUP(){
        lvl += 1
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0

        nextLvlXP += 100
    }

}

fun main() {
    var p:player = player(str = 2)

    p.recieveXP(10)
    p.recieveXP(100)
    p.recieveXP(100)
}



class SugarStorage(var volume:Int = 0){
    fun decreaseSugar(v:Int){
        if (volume-v < 0)
            volume = 0
        else volume-=v
    }
    fun increaseSugar(v:Int){
        volume+=v
    }

}
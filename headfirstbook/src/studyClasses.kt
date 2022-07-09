class Dog(val name: String, var weight: Int, val breed: String){
    fun bark(){
        println(if (weight <20) "Yip" else "Woof!")
        var myDog = Dog("Fido", 70, "Mixed")
        println(myDog.name)
        myDog.weight=75
        myDog.bark()
    }

}


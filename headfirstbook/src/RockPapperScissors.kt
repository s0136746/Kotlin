fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}
fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]
fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    //Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {
        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoise: String, gameChoice:String){
    val result: String
    if(userChoise == gameChoice) result = "Tie"
    else if((userChoise == "Rock" && gameChoice == "Scissors") ||
        (userChoise == "Papper" && gameChoice =="Rock") ||
        (userChoise == "Scissors" && gameChoice =="Paper")) result = "You win"
    else result = "You lose!"
    println("You chose $userChoise. I chose $gameChoice. $result")
}
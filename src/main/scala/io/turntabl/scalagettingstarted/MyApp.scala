package io.turntabl.scalagettingstarted


object MyApp extends App {
    val length = (word: String) => word.length()

    val space = (sentence: String) => sentence.count(_ == ' ')

    val ApplyToString = (s: String, f: (String => Int)) => f(s)

    println(ApplyToString("Doreen", length))
    println(ApplyToString("Doreen was here", space))

    val calculate = (instruct: String) => ((num1: Int, num2: Int) => instruct match{
        case "add" => num1 + num2
        case "subtract" => num1 - num2
        case "multiply" => num1 * num2
    })

    val instruct = calculate("multiply")
    println(instruct(3, 2))
}

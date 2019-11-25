package io.turntabl.scalagettingstarted

object MyApp extends App {
    val name: String = "Doreen"
    val town: String = "Accra"
    print(s"$name was born in $town \n")

    def threeTime(s: String) = s * 3

    def even(i: Int) = if(i % 2 == 0) true else false

    def odd(i: Int) = if (even(i)) false else true

    def wordsToLower(words: String*) = words map (_.toLowerCase)

    def even2(i: Int) = even(i)

    def isWeekendDay(day: String) = day match{
        case "saturday" | "sunday" => true
        case _ => false
    }

    def areWeekendDays(days: String*) = days map isWeekendDay
    

    areWeekendDays("monday", "saturday", "tuesday", "sunday") foreach(println)

    def nTimes(s: String, i: Int) = print(s * i)



}

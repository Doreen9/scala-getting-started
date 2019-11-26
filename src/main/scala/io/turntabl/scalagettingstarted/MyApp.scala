package io.turntabl.scalagettingstarted


object MyApp extends App {
    val name = "Doreen"
    val town = "Accra"
    print(s"$name was born in $town")


    def treeTimes(s: String) = s * 3


    def even(i: Int) = if (i % 2 == 0) true else false

    def odd(i : Int) = if(even(i)) false else true

    def wordsToLower(words: String*) = words map(_.toLowerCase)

    def even2(i: Int) = even(i)

    def isWeekendDay(day: String) = day match{
        case "saturday" | "sunday" => true
        case _ => false
    }

    def areWeekendDays(days: String*) = days map (isWeekendDay(_))

    areWeekendDays("monday", "friday", "saturday") foreach (println)



}

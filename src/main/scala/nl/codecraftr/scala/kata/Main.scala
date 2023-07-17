package nl.codecraftr.scala.kata

object Main extends App {
    private def fizzBuzz =
        (1 to 100)
            .map(transform)

    private def transform(number: Int) = {
        if (number % 15 == 0)
            "FizzBuzz"
        else if (number % 3 == 0)
            "Fizz"
        else if (number % 5 == 0)
            "Buzz"
        else number.toString
    }

    fizzBuzz.foreach(println)
}

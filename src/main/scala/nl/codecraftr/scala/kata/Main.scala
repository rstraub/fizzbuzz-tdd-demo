package nl.codecraftr.scala.kata

object Main extends App {
    private def fizzBuzz = {
        (1 to 100)
            .map(transform)
            .foreach(println)
    }

    private def transform(number: Int) = number.toString

    fizzBuzz
}

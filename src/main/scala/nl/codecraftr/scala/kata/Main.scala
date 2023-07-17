package nl.codecraftr.scala.kata

object Main extends App {
    def fizzBuzz =
        (1 to 100)
            .map(transform)

    private def transform(number: Int) =
        number match {
            case x if x % 15 == 0 => "FizzBuzz"
            case x if x % 5 == 0 => "Buzz"
            case x if x % 3 == 0 => "Fizz"
            case x => x.toString
        }

    fizzBuzz.foreach(println)
}

package nl.codecraftr.scala.kata

import nl.codecraftr.scala.kata.FizzBuzz.{fizzBuzz, toFizzBuzz}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FizzBuzzSpec extends AnyFlatSpec with Matchers {
    // TODO property based / table test here?
    "fizzbuzz" should "return a number if its not divisible by anything" in {
        toFizzBuzz(1) shouldBe "1"
    }

    it should "return Fizz given number divisible by 3" in {
        toFizzBuzz(3) shouldBe "Fizz"
    }

    it should "return Fizz given number divisible by 5" in {
        toFizzBuzz(5) shouldBe "Buzz"
    }

    it should "return FizzBuzz given number divisible by 3 and 5" in {
        toFizzBuzz(15) shouldBe "FizzBuzz"
    }

    "1 to 100" should "return a 100 values" in {
        fizzBuzz should have size 100
    }

    it should "parse the numbers to fizz, buzz and fizzbuzz" in {
        fizzBuzz(1 - 1) shouldBe "1"
        fizzBuzz(3 - 1) shouldBe "Fizz"
        fizzBuzz(5 - 1) shouldBe "Buzz"
        fizzBuzz(15 - 1) shouldBe "FizzBuzz"
    }
}

object FizzBuzz {
    def fizzBuzz: Seq[String] = (1 to 100).map(toFizzBuzz)

    def toFizzBuzz(number: Int): String = {
        number match {
            case x if x % 15 == 0 => "FizzBuzz"
            case x if x % 3 == 0 => "Fizz"
            case x if x % 5 == 0 => "Buzz"
            case x => x.toString
        }
    }
}

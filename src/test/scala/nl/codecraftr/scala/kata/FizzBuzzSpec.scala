package nl.codecraftr.scala.kata

import nl.codecraftr.scala.kata.FizzBuzz.fizzBuzz
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FizzBuzzSpec extends AnyFlatSpec with Matchers {
    // TODO property based / table test here?
    "fizzbuzz" should "return a number if its not divisible by anything" in {
        fizzBuzz(1) shouldBe "1"
    }

    it should "return Fizz given number divisible by 3" in {
        fizzBuzz(3) shouldBe "Fizz"
    }

    it should "return Fizz given number divisible by 5" in {
        fizzBuzz(5) shouldBe "Buzz"
    }
}

object FizzBuzz {
    def fizzBuzz(number: Int): String = {
        if (number % 3 == 0) "Fizz"
        else if (number % 5 == 0) "Buzz"
        else number.toString
    }
}

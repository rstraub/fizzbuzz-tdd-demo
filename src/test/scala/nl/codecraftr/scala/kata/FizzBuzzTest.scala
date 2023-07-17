package nl.codecraftr.scala.kata

import nl.codecraftr.scala.kata.Main.fizzBuzz
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FizzBuzzTest extends AnyFlatSpec with Matchers {
    "FizzBuzz" should "whole thing works" in {
        fizzBuzz should have size 100
        fizzBuzz should contain allElementsOf(Seq("Fizz", "Buzz", "FizzBuzz"))
    }
}

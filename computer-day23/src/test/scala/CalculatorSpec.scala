import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import Calculator._
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import scala.collection.mutable.Stack

class CalculatorSpec extends AnyFlatSpec {
  val path = "C:\\projects\\computer-day23\\test.txt"
  val input = Seq("- 2", "+ 1", "PRINT", "* 2", "PRINT", "/", "+ 2","-")

    it should  "check if file is correct" in {
      linesFromFile(path)  == input
    }


    it should "if calculation is correct" in {
      calculate(input) == 1
    }





}



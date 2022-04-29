import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.wordspec.AnyWordSpec

object ScalaTestPractice {

}

class CalculatorSuite extends AnyFunSuite {
  val calculator = new Calculator

  test("multiplication by 0 should always be 0") {
    assert(calculator.multiply(63826,0) == 0)
    assert(calculator.multiply(-63826,0) == 0)
    assert(calculator.multiply(0,0) == 0)
  }

  test("dividing by 0 should throw a math error") {
    assertThrows[ArithmeticException](calculator.divide(10,0))
  }
}

class CalculatorSpec extends AnyFunSpec {

  val calculator = new Calculator

  describe("multiplication") {
    it("should give back 0 if multiplying by 0"){
      assert(calculator.multiply(63826,0) == 0)
      assert(calculator.multiply(-63826,0) == 0)
      assert(calculator.multiply(0,0) == 0)
    }
  }

  describe("division"){
    it("should throw a math error if dividing by 0"){
      assertThrows[ArithmeticException](calculator.divide(10,0))
    }
  }

}

class CalculatorWordSpec extends AnyWordSpec {
  val calculator = new Calculator

  "A calculator" should {
    "give back 0 if multiplying by 0" in {
      assert(calculator.multiply(63826,0) == 0)
      assert(calculator.multiply(-63826,0) == 0)
      assert(calculator.multiply(0,0) == 0)
    }

    "throw a math error if dividing by 0" in {
      assertThrows[ArithmeticException](calculator.divide(10,0))
    }
  }

}

class CalculatorFlatSpec extends AnyFlatSpec {

  val calculator = new Calculator

  "A calculator" should
    "give back 0 if multiplying by 0" in {
    assert(calculator.multiply(63826,0) == 0)
    assert(calculator.multiply(-63826,0) == 0)
    assert(calculator.multiply(0,0) == 0)
  }

}


class Calculator {
  def add (a: Int, b: Int): Int = a + b
  def subtract (a: Int, b: Int): Int = a - b
  def multiply (a: Int, b: Int): Int = a * b
  def divide (a: Int, b: Int): Int = a / b
}
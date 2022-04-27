import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SquareSpec extends AnyFlatSpec with should.Matchers{

  behavior of "Square"
  it should "return correct perimeter of Square" in {

    val firsSquare = Square(5)
    val actual = firsSquare.perimeter
    val expected = 20
    actual shouldBe expected
  }

  it should "return correct area of Square" in {

    val secondSquare = Square(5)
    val actual = secondSquare.area
    val expected = 25
    actual shouldBe expected
  }
}

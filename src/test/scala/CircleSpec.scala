import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CircleSpec extends AnyFlatSpec with should.Matchers{

  behavior of "Circle"
  it should "return correct perimeter of Circle " in {
    val firstCricle = Circle(5)
    val actual = firstCricle.perimeter
    val expected = 31.400000000000002
    actual shouldBe expected
  }

  it should "retur correct area of Circle" in {
    val secondCircle = Circle(5)
    val actual = secondCircle.area
    val expected = 78.5
    actual shouldBe expected
  }
}

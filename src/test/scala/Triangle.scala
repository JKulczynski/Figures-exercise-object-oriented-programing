import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Triangle extends AnyFlatSpec with should.Matchers {

  behavior of "Triangle"
  it should "return correct perimeter of Triangle" in {
    val firstTriangle = Triangle(5,5,5,5)
    val actual = firstTriangle.perimeter
    val expected = 15
    actual shouldBe expected
  }

  it should "return correct area of Triangle" in {
    val secondTriangle = Triangle(5,5,5,5)
    val actual = secondTriangle.area
    val expected = 12.5
    actual shouldBe expected
  }
}

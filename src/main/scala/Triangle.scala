case class Triangle(height: Int, a: Int, b: Int, c: Int) {

  def perimeter: Int = a + b + c

  def area: Double = 0.5 * a * height
}

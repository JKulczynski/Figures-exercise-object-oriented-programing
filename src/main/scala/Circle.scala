case class Circle(radius: Double, pi: Double = 3.14) {

  def perimeter: Double = 2 * pi * radius

  def area: Double = pi * radius * radius
}

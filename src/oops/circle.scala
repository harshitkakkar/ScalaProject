package oops

class circle (val radius:Double) extends shape {
  override def area :Double = math.Pi*radius
  override def perimeter :Double = 2*math.Pi*radius
  
}
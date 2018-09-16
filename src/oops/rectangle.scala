package oops

 class rectangle (val width:Double  , val height :Double) extends shape {
  override def area :Double = width * height
  override def perimeter :Double = 2*(width + height)
}
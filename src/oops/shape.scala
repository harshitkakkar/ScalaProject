package oops

abstract class shape {
  def area :Double 
  def perimeter :Double 
}

object shapes {
    def main(args:Array[String]):Unit = {
      val rect = new rectangle(3,4)
      printShapes(rect)
      val Circle = new circle(3)
      printShapes(Circle)
      val Square = new square(5)
      printShapes(Square)
    }
    
 def printShapes(s:shape):Unit = {
     println(s"Area is ${s.area}")
     println(s"perimeter is ${s.perimeter}")
   }
}

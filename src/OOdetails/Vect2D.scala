package OOdetails

class Vect2D (val x :Double , val y:Double) {
  def plus(v:Vect2D) =  Vect2D(x+v.x , y+v.y)
  def minus(v:Vect2D) =  Vect2D(x-v.x , y-v.y)
  def Scale(c:Double)=  Vect2D(x * c , y * c)
  def magnitude = math.sqrt(x * x + y * y)
   
  def apply(index:Int):Double =index match {
    case 0 => x
    case 1 => y
    case _ => throw new IndexOutOfBoundsException(s"2D vector indexed at $index.")
  }
}

object Vect2D {
  def main(agrs:Array[String]) :Unit = {
    val v1 =  Vect2D(5,4)
    val v2 =  Vect2D(1,5)
    val v3 = v1 plus(v2)
    v1(0)
    println(v3.magnitude)
  }
  def apply(x:Double , y:Double) = new Vect2D(x,y) 
  
 /*  apply method will help to remove
  new key words used in defining the value ..
  so apply method is usually used inside companion object.*/
}
package allAboutScala

import java.util.Random

object HighOrderFunction extends App {
  
  println("How to define a higher order function")
  def totalcostOfDonut (donutType :String)(Quantity:Int)(f :Double => Double) = {
    
    val totalcost = 2.5 * Quantity
    f(totalcost)
  }
  
  def applyDiscount( totalcost:Double):Double = {
    val discount = 2
    totalcost - discount
  }
  
  println(s"totalcost = ${totalcostOfDonut("Glazed Donut")(5)(applyDiscount(_))}")
    
}
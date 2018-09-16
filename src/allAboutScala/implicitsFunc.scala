package allAboutScala

object FunctionWithImplicits extends App {
  
class implicitsFunc(s :String) {
 
  def myfavroiteDonut : Boolean = s =="Galzed Donut"  
}

object DonutConversion {
  
  
  implicit def StringToDonut( s:String) = new implicitsFunc(s)
} 

import DonutConversion._
    
  val galzedDonut = "Galzed Donut"
  val VanillaDonut = "Vanilla Donut"
  
   println(s"Is Galzed Donut my favirote dount  = ${galzedDonut.myfavroiteDonut}")
   println(s"Is Vanilla Donut my favirote dount  = ${VanillaDonut.myfavroiteDonut}")
}
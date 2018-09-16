package allAboutScala.collections

object foldFunc extends App {
  
  val prices :Seq[Double] = Seq(2.5 , 4.5, 6.3)
  println(s"prices of donut = ${prices}")
  
  val sum = prices .fold(0.0)(_+_)
  
  println(s"prices of donut = ${sum}")
  
  val donutNames :Seq[String] = Seq("Plain" , "Strawberry" , "Glazed")
  println(s"Elements of donut = ${donutNames}")
  
  println(s"All donuts = ${donutNames.fold("")((acc ,s) => acc + s + " Donut ")}")
  
  val lastName:(String,String) => String = (s1 , s2) => s1 + s2 + " Donut "
  
  println(s" All Donuts using value function = ${donutNames.fold("")(lastName)}")
}
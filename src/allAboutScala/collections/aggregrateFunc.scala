package allAboutScala.collections

object aggregrateFunc extends App {
  
  val donutbasket : Seq[String] = Seq("Plain donut" , "Strawberry Donut")
  println(s"elements of donutbaket are = ${donutbasket}")
  
  val donutbasketaccumulator:(Int,String) => Int = (accumulator,donutName) => accumulator + donutName.length
  
  val totallength = donutbasket.aggregate(0)(donutbasketaccumulator, _+_)
  
  println(s"Total lenght of donutbasket is = ${totallength}")
  
  val donutbasket2 :Seq[(String, Double,Int)] = Seq(("Plain Donut",1.0, 10),("Strawberry Donut",2.0,10))
  println(s"elements of donutbasket2 is =${donutbasket2}")
   
  val donutbasket2accumulator:(Double, Double,Int) => Double = (accumulator, price , quantity) => accumulator + (price * quantity)

  val totallenght2 = donutbasket2.aggregate(0.0)((acc:Double ,tuple:(String,Double,Int)) =>donutbasket2accumulator(acc,tuple._2,tuple._3), _+_)
  
  println(s"Total lenght of donutbasket2 is = ${totallenght2}")

}
package allAboutScala.collections

object partition extends App {
  
  val donutNameandPrice : Seq[Any] = Seq("Plain Donut", 2.5 , "Strawbery Donut", 5.5)
  println(s"Element of donutNameandPrice = ${donutNameandPrice}")
  
  val donutPartition : (Seq[Any],Seq[Any]) = donutNameandPrice.partition {
    case name:String => true
    case price :Double => false
  } 
    println(s"Elements of DonutPartition = $donutPartition")
    println(s"Elements of DonutNames = ${donutPartition._1}")
    println(s"Elements of DonutPrices = ${donutPartition._2}")
    
    
  val (donutName , donutPrice) = donutNameandPrice.partition{
      case name:String => true
      case _ => false
    }
    println(s"donutName = $donutName")
    println(s"donutPrice =$donutPrice")
    
}
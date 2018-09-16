package allAboutScala

object curriedandpartialFunc extends App {

  def totalcost (DonutType:String)(Quantity:Int)(discount:Double):Double ={
    
    println(s"calculating total cost of $Quantity  $DonutType with ${discount * 100}% discount")
    
    val totalcost = Quantity * 2.50
    totalcost - ( totalcost * discount)
    
  }
   println(s"total cost =${totalcost("Vanilla Donut")(10)(0.1)}") 
   
   val totalCostForGlazedDonuts = totalcost("Glazed Dount")_
   
   println(s"totalcost = ${totalCostForGlazedDonuts(10)(0.2)}")
 
}
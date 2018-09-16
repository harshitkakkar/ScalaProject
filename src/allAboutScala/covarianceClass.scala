package allAboutScala

object covarianceClass extends App {
   println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name :String)  {
     def PrintName
  }
  
  println("\nStep 2: How to extend the abstract class Donut and define a sub-class named VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name) {

    override def PrintName: Unit = println(name)
   }
   
   println("\nStep 3: How to extend abstract class Donut and define a sub-class of Donut called GlazedaDonut")
   case  class GlazedDonut(name :String) extends Donut(name) {
     override def PrintName = println(name)
   }
      
      println("\nStep 4: How to instantiate Donut objects")
        val vanillaDonut: VanillaDonut = VanillaDonut("Vanilla Donut")
        vanillaDonut.PrintName
      
        val glazedDonut: Donut = GlazedDonut("Glazed Donut")
        glazedDonut.PrintName
        
    println("\nStep 5: How to define a ShoppingCart type class which expects Donut types")
    class ShoppingCart [ D<:Donut] (donut:Seq[D]) {
        
        def printCartItems = donut.foreach(_.PrintName)
        }
      
    println("\nStep 6: How to create instances or objects of ShoppingCart class")   
    val shoppingCart :ShoppingCart[Donut] = new ShoppingCart[Donut](Seq[Donut](vanillaDonut , glazedDonut))
    shoppingCart.printCartItems
    
    println(s"\nStep 7: How to enable covariance on ShoppingCart2")
    class ShoppingCart2 [+D <:Donut](donut:Seq[D]) {
       def printCartItems = donut.foreach(_.PrintName)
    }
    
  val shoppingCart2: ShoppingCart2[Donut] = new ShoppingCart2[VanillaDonut](Seq(vanillaDonut))
  shoppingCart2.printCartItems
  
  println(s"\nStep 8: How to enable contra-variance on ShoppingCart")
    class ShoppingCart3[-D <: Donut](donut: Seq[D]) {
    def printCartItems = donut.foreach(_.PrintName)
}
 
  val shoppingCart3: ShoppingCart3[VanillaDonut] = new ShoppingCart3[Donut](Seq(glazedDonut))
  shoppingCart3.printCartItems
     
}
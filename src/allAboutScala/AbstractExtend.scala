package allAboutScala

object ExtendsClass extends App {
  
  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name :String)  {
     def PrintName
  }
  
   println("\nStep 2: How to extend abstract class Donut and define a sub-class of Donut called VanillaDonut")
    class VanillaDonut(name :String) extends Donut(name) {
     override def PrintName = println(name)
   }
   object VanillaDonut {
      def apply(name:String) :Donut = {
        new VanillaDonut(name)
      }
   }
   
   println("\nStep 3: How to extend abstract class Donut and define a sub-class of Donut called GlazedaDonut")
    class GlazedDonut(name :String) extends Donut(name) {
     override def PrintName = println(name)
   }
   object GlazedDonut {
      def apply(name:String) :Donut = {
        new GlazedDonut(name)
      }
   }
      
      println("\nStep 4: How to instantiate Donut objects")
      val vanillaDonut:Donut = VanillaDonut("Vanilla Donut")
      vanillaDonut.PrintName
      
        val glazedDonut: Donut = GlazedDonut("Glazed Donut")
        glazedDonut.PrintName
   
}
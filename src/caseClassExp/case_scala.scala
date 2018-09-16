package caseClassExp.CaseClass_Tutorial


object case_scala extends App {
  
  case class Donut(name:String , Price :Int , ProductCode:Option[Long] = None)
  
  println("\nStep 2: How to create instances or objects for the Donut case class")
   val VanillaDonut  = Donut("VanillaDonut" , 30 )
   val GlazedDonut   = Donut("GlazedDonut", 40)
   println(s"VanillaDonut : $VanillaDonut")
   println(s"GlazedDonut : $GlazedDonut")
  
  println("\nStep 3: How to access fields of the Donut object")
    println(s"VanillaDount fields = ${VanillaDonut.name}")
    println(s"VanillaDount fields = ${VanillaDonut.Price}")
    println(s"GlazedDonut fields = ${GlazedDonut.name}")
    println(s"GlazedDonut fields = ${GlazedDonut.ProductCode}")
    
  println("\nStep 5: How to define the hashCode and equals method for Donut object")
     val ShoppingCart: Map[Donut, Int] =Map(VanillaDonut -> 3 , GlazedDonut -> 4 )
      println(s"All items in shopping cart = ${ShoppingCart}")
      println(s"Quantity of vanilla donuts in shopping cart = ${ShoppingCart(VanillaDonut)}")
      println(s"Quantity of glazed donuts in shopping cart = ${ShoppingCart(GlazedDonut)}")
      
  println("\nTIP: How to create a new object of Donut by using the copy() method of the case class")
      val ChocolateVanillaDonut :Donut = VanillaDonut.copy(name="Chocolate and Vanilla" , Price =100)
       println(s"Chocolate And Vanilla Donut = $ChocolateVanillaDonut")
}
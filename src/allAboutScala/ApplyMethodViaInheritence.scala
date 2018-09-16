package allAboutScala

object ApplyMethodViaInheritence extends App {
 
  class Donut(name :String , productCode:Option[Long] = None){
    def print = println(s"Name of Donut = ${name} , productCode is = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")
  }
  
  class GlazedDonut(name :String) extends Donut (name :String)
  class VanillaDonut(name :String) extends Donut(name:String)
  
  object Donut {
    private val uuid = math.random()
    
    def apply(name : String) :Donut = {
      /*name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)*/
      new Donut(name)
      }
        def apply(name:String ,productCode:Option[Long]):Donut ={
          new Donut(name , productCode)
        }
  }
  
  val glazedDonut = Donut("Glazed Donut" ,Some(1111))
  //println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
  glazedDonut.print
  
    val vanillaDonut = Donut("Vanilla Donut")
 // println(s"The class type of glazedDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print
}
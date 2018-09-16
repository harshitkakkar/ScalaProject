package otherCollections

import scala.io.Source
 
object removingDuplicates extends App {
  
 case class NameInfo(Name:String , Gender:String , count:Int)
  
  val year = 2017
  val source = Source.fromFile(s"BabyNames/yob$year.txt")
  val names = source.getLines().filter(_.nonEmpty).map{ x =>
    val p = x.split(",")
   Seq(NameInfo(p(0) , p(1) , p(2).toInt))
 }.toSet
 
 val Count = names.size
 
println(Count)

}
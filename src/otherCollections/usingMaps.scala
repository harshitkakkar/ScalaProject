package otherCollections

import scala.io.Source
import io.StdIn._

object usingMaps extends App {
 
  case class NameInfo(gender:String , year:Int , name:String , count:Int)
 val Stateinfo = for(stateFile <- new java.io.File("BabyNames").list(); if stateFile.endsWith(".TXT")) yield {
      val source = Source.fromFile("BabyNames/"+stateFile)
      val info = source.getLines().filter(_.nonEmpty).map { line =>
        val p = line.split(",")
        NameInfo(p(1) , p(2).toInt, p(3), p(4).toInt)
      }.toArray.groupBy(_.name)
      source.close()
      (stateFile.take(2) , info)         
    }
 
   println("what name you want to search?")
    val names = readLine()
      if(names=="quit") Nil
      else
    for((state , info) <- Stateinfo){
      println(state+ " : "+info(names).maxBy(_.count))   
  }
}
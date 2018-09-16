package otherCollections

import scala.io.Source

object UsingSets extends App {
  val year = 2015
  
  val nationalData = {
  val source = Source.fromFile(s"BabyNames/yob$year.txt")
  val names = source.getLines().filter(_.nonEmpty).map(x=>x.split(",")(0)).toSet
source.close()
names
  }
  
val info = for(stateFile <- new java.io.File("BabyNames").list(); if stateFile.endsWith(".TXT")) yield {
      val source = Source.fromFile("BabyNames/"+stateFile)
      val names = source.getLines().filter(_.nonEmpty).map(x => x.split(",")).
        filter(a => a(2).toInt == year).map( x => x(3)).toSet
          source.close()
          (stateFile.take(2) , names)         
    }
    val start = System.nanoTime()
   for((states , snames) <- info){
  println(states+" "+snames.count(x => nationalData.contains(x)).toDouble /nationalData.size)
}
    println((System.nanoTime()-start)/1e9)
}
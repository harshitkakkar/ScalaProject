package otherCollections

object Duplicated extends App {
  
val dup = List("1|1|1|2|3|4|5|5|6|100|101|101|102").flatMap(_.split("\\|"))
//val ans1 = dup.groupBy(identity).collect { case (x, List(_,_,_*)) => x }
val ans2 = dup.groupBy(identity).map(t => (t._1, t._2.size))
//val ans = dup.diff(dup.distinct).distinct
//val ans2 = dup.groupBy(identity).map(t => (t._1, t._2.size))
//val distinct1 = Split.distinct
//val elementsWithCounts = distinct1.map( (a:Int) => (a, dup.count( (b:Int) => a == b )) )
//val duplicatesRemoved = elementsWithCounts.filter( (pair: Pair[Int,Int]) => { pair._2 <= 1 } )
//val withDuplicates = elementsWithCounts.filter( (pair: Pair[Int,Int]) => { pair._2 > 1 } )

ans2.foreach(println)
//elementsWithCounts.foreach(println)
//duplicatesRemoved.foreach(println)
//withDuplicates.foreach(println)s
}
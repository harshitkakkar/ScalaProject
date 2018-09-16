package Basics

import scala.io.StdIn._
import java.io.PrintWriter
import scala.io.Source

object Libraries {
  def main(agrs:Array[String]):Unit = {
        
    val source = Source.fromFile("Matrix")
    val lines = source.getLines()
    val matrix = lines.map(x => x.split(" ").map(_.toDouble)).toArray
    source.close()
    
    val pw = new PrintWriter("rowSum.txt")
    matrix.foreach { x => pw.println(x.sum) }
    pw.close()
    
    println("What is your name")
    val name = readLine()
    println("what is you age")
    val age = readInt() 
    val Array(a,b,c) = "one two three".split(" ")
     
    val lst = buildList()
    println(ConcatString(lst))
    println(ConcatStringPat(lst))
    
    val plus3 = add(3)_  
    val eight = plus3(5)

   println( threeTuple(math.random))
   
  }
     def add (x:Int) (y:Int):Int = x+y
     def threeTuple(a : => Double) : (Double , Double, Double) = {
       (a,a,a) 
     /* for pass-by-name function to work we need to add rocket sign to make 
       it select random values , but it will make it as a function */
     }
       
    def buildList():List[String]= {
      val input = readLine()
      if(input=="quit") Nil
      else input :: buildList()
    }
     def ConcatString(words:List[String]):String= {
       if(words.isEmpty) ""
       else words.head + " " + ConcatString(words.tail)
     } 
     
     def ConcatStringPat(words:List[String]):String= words match {
       case Nil => ""
       case h :: t => h + "," + ConcatStringPat(t)
     }
  }
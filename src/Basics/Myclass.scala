package Basics

object Myobject {
def   test() :Unit = {
    println("text mesage")
  }
  
}
object mainClass {
   def main(agrs:Array[String]):Unit = {
    Myobject.test()
  }
}
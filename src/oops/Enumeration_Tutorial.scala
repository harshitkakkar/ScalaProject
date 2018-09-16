package oops

object Enumeration_Tutorial extends App {
  
println("Step 1: How to create an enumeration")

object Donut extends Enumeration {
  type Dount = Value
  
 val Galzed = Value("Galzed")
 val Strawberry = Value("Strawberry")
 val Plain = Value("Plain")
 val Vanilla = Value("Vanilla")
}

 println("How to Print String value of Enumeration")
 println(s"Vanilla Donut String value = ${Donut.Vanilla}")
 
 println("How to Print Id value of Enumeration")
 println(s"Vanilla Donut's ID = ${Donut.Vanilla.id}")
 
 println("How to Print all values of Enumeration")
 println(s"Vanilla Donut's type = ${Donut.values}")
 
 println("How to pattern match on Enumeration values")
 Donut.values.foreach {
   case d if (d ==Donut.Strawberry || d == Donut.Vanilla) => println(s"Favorite Dount's =$d")
   case _=> None
 }
 
 println("How to change the default ordering to Enumeration values ")
   object DonutTaste extends Enumeration {
   
   type DonutTaste = Value
   
     val Tasty =     Value(0 , "Tasty")
     val veryTasty = Value(1 , "veryTasty")
     val ok =        Value(-1 , "OK")
 }
 
  println(s"Donut taste value = ${DonutTaste.values}")
  println(s"Donut OK taste Id = ${DonutTaste.ok.id}")   
  
}

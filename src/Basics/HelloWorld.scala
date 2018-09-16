package Basics

object HelloWorld {
  
  val name = "Harshit"
  val age = 26
  
  val message = s"$name is $age years old"
  
  def main(args: Array[String]):Unit = {
    println("HelloWrold" +"\n" + message)
    
    var x = 0 
    while ( x < 10) {
      println("value is " + x)
      x+=1
    }
    println(if(age<18) "Not legal" else"legal")
    
    val value = for {
       x <- 0 until 10 
     if  x%2==0 || x%5==0
       sqr= x*x
       j <- 'a' to 'c'
    } yield {
       x -> j
    }
    println(value)
    
    val  fizzbuzz = for (  i <-0 to 20) yield {
      (i%2 , i%5) match {
        case (0,0) => "fizzbuzz"
        case (0,_) => "fizz"
        case (_,0) => "buzz"
        case _     => i.toString
      }
    }
    println(fizzbuzz)
  } 
}
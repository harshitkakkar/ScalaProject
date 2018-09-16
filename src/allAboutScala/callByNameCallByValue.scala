package allAboutScala
import java.util.Random

object callByNameCallByValue extends App {
  
  val listOrders = List(("Glazed Donut",40,0.1),("Vanilla Donut",50,0.2))
  
  def placeOrderCallbyValue (orders:List[(String,Int,Double)])(exchangeRate:Double):Double ={
    var totalcost :Double = 0.0
    
    orders.foreach { order =>
      val costofItem = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £${costofItem}")
      totalcost +=costofItem
    }
    totalcost
  }
  println(s"Total cost of order = £${placeOrderCallbyValue(listOrders)(0.5)}")
  
  def placeOrderCallbyName(orders1:List[(String,Int,Double)])(exchangeRate : => Double):Double = {
    var totalcost1 :Double = 0.0
    
    orders1.foreach { order =>
      val costofItem1 = order._2 * order._3 * exchangeRate
      println(s"Cost of ${order._2} ${order._1} = £${costofItem1}")
      totalcost1 +=costofItem1
    }
    totalcost1   
  }
  val RandomExchangeRate = new Random(10)
  def usdTogbp :Double = {
    val rate = RandomExchangeRate.nextDouble()
    println(s"Fetching USD to GBP exchnage rate = ${rate}")
    rate
  }
   println(s"total cost of orders = £${placeOrderCallbyName(listOrders)(usdTogbp)}")
}
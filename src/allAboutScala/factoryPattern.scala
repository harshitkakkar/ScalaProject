package allAboutScala

object factoryPattern extends App {
  
  abstract class Room {
    def bookingPrice :Int
    def avability :Int
    def facilities : List[String]
    def book(noOfRooms :Int)
  }
  
  object Room {
    val STANDARD  = 0
    val DELUXE  = 1
    val SUPER_DELUXE  = 2

  
    private class StandardRoom extends Room {
      
    private var  _avability = 20
    override def bookingPrice = 50
    override def facilities = List("Single bed" , "Mini fridge", "Table","Fan")
    override def avability = _avability
    override def book(noOfRooms :Int) = {
      _avability = _avability - noOfRooms 
    }
  }
  
    private class DeluxeRoom extends Room {
    
    private var  _avability = 9
    override def bookingPrice = 70
    override def facilities = List("King Size bed" , "fridge", "Table","AC")
    override def avability = _avability
    override def book(noOfRooms :Int) = {
      _avability = _avability - noOfRooms 
    }
  }
    
    private class SuperDeluxeRoom extends Room {
    
    private var  _avability = 5
    override def bookingPrice = 110
    override def facilities = List("King Size bed" ,"Single bed", "fridge", "Table","AC","Gym")
    override def avability = _avability
    override def book(noOfRooms :Int) = {
      _avability = _avability - noOfRooms 
    }
  }
  
  def apply(roomType:Int):Room = {
    roomType match {
      case  SUPER_DELUXE  => new SuperDeluxeRoom()
      case  DELUXE  => new DeluxeRoom()
      case  _ => new StandardRoom()
    }
  }
      
  val s = Room(STANDARD) 
  println(s"${s.bookingPrice}")
  println(s"${s.avability}")
  
  val d = Room(DELUXE)
  println(s"${d.facilities}")
  println(s"${d.book(19)}")
  
  val sd = Room(SUPER_DELUXE)
  println(s"${sd.bookingPrice}")
  println(s"${sd.avability}")
  
  }
}
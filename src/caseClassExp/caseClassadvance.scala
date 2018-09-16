import scala.util.{Failure, Success, Try}

object caseClassadvance  extends App {

case class Product(name: String, url: Option[String])
case class User(name: String, fullName: String, age: Int)

case class Customer(name: String, project: String, age: Int) {
  def this(u: User, p: Product) = this(u.name, p.name, u.age)
}

object Customer{
  def apply(u: User, p: Product): Option[Customer] = Try {
    require(u.age >= 0)
    require(u.name.matches("^[a-zA-Z0-9]*$"))

    new Customer(u, p)
  } match {
    case Success(c) => Some(c)
    case Failure(e) => None
  }
}

Customer(
  User("vasily", "Vasily Vasinov", 26),
  Product("Amazon EC2", None) 
)
}
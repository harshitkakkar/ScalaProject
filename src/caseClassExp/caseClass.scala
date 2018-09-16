package caseClassExp

sealed trait Resources  {
  def fullpath :String
}

case class Folder (name :String ,
    path :Option[String] = None) extends Resources {
    def fullpath :String = path match {
      case Some(p) => List(p, name).mkString("/")
      case None => s"./$name"
    }
}

case class File (name :String ,
      folder :Option[Folder] = None ) extends Resources {
  def fullpath :String = folder match {
    case Some(f) => List(f.fullpath, name).mkString("/")
    case None => s"./$name"    
  }
}

object caseClass {
  def main(agrs:Array[String]):Unit = {
 
val resources = Seq[Resources] (
File("ex1.Scala",Some(Folder("example",Some("~/Dev")))),
Folder("temp"),
Folder("bin",Some("/usr")),
File("Clouder")
)  

resources foreach {
  case f :File => println(s"File: ${f.fullpath}")
  case f:Folder  => println(s"FOlder : ${f.fullpath}")
 }
}
}
package OObasics

object GradeBooks {
  def main(agrs:Array[String]):Unit = {
    
    val Students = List(new Student("Harshit","Kakkar",List(20),List(69),List(120)), 
        new Student("Sam","Mehra",List(27),List(130),List(152)))
        for(s <- Students) printStudent(s)
  }
  def printStudent(s:Student) :Unit = {
    
    println(s.firstName+" "+s.lastName)
    println("Grade= " + s.average)
    println("Quizzes= " + s.quizzes.mkString(","))
    println("Assignments= " + s.assignment.mkString(","))
    println("Tests= " + s.tests.mkString(","))
  }
}
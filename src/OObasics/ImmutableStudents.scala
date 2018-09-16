package OObasics

class ImmutableStudents (
  val firstName :String ,
  val  lastName : String ,
  val quizzes :List[Int] = Nil,
  val assignment :List[Int]= Nil,
 val tests :List[Int] = Nil) {
 
   private def validGrade(grade :Int) :Boolean = grade >= 0 && grade <= 100
   
  def addquizz(grade :Int) :ImmutableStudents = if(validGrade(grade))
      new ImmutableStudents(
      firstName,
      lastName,
      grade :: quizzes ,
      assignment,
      tests)
  else this
  
    def addassignment(grade :Int) :ImmutableStudents =if(validGrade(grade))
      new ImmutableStudents(
      firstName,
      lastName,
     quizzes ,
      grade :: assignment,
      tests)
    else this
  
    def addtests(grade :Int) :ImmutableStudents =if(validGrade(grade))
      new ImmutableStudents(
      firstName,
      lastName,
      quizzes ,
      assignment,
     grade :: tests)
    else this
  def quizzAverage :Double = if(quizzes.isEmpty) 0.0
  else if (quizzes.length == 1) quizzes.head
  else (quizzes.sum -quizzes.min).toDouble/(quizzes.length -1)
  
  def assignmentAverage:Double = if(assignment.isEmpty) 0.0
  else assignment.sum.toDouble/assignment.length
  
  def testAverage :Double = if(tests.isEmpty) 0.0
  else tests.sum.toDouble/tests.length
  
  def average :Double = quizzAverage*0.1 + testAverage*0.5 + assignmentAverage*0.4
  }
  
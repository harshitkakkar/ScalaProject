package OObasics

class Student (
  val firstName :String ,
  val  lastName : String ,
  private var _quizzes :List[Int] = Nil,
  private var _assignment :List[Int]= Nil,
  private  var _tests :List[Int] = Nil) {
  
  private def validGrade(grade:Int):Boolean = grade >= 0 && grade <= 100
  
  def addquizz(grade :Int) :Boolean = if(validGrade(grade)){
  _quizzes ::= grade 
  true
  }else false
  
  def addassignment(grade :Int) :Boolean =if(validGrade(grade)){ 
  _assignment ::= grade 
  true
  }else false
  
  def addtests(grade :Int) :Boolean =if(validGrade(grade)){
  _tests ::= grade 
  true
  }else false
  
  def quizzAverage :Double = if(_quizzes.isEmpty) 0.0
  else if (_quizzes.length == 1) _quizzes.head
  else (_quizzes.sum -_quizzes.min).toDouble/(_quizzes.length -1)
  
  def assignmentAverage:Double = if(_assignment.isEmpty) 0.0
  else _assignment.sum.toDouble/_assignment.length
  
  def testAverage :Double = if(_tests.isEmpty) 0.0
  else _tests.sum.toDouble/_tests.length
  
  def average :Double = quizzAverage*0.1 + testAverage*0.5 + assignmentAverage*0.4
  
  def quizzes = _quizzes
  def assignment = _assignment
  def tests = _tests
  
  /*Since it is a List so it is a good option to rename it , if it was any other like 
  Array then approach should be different*/
  }
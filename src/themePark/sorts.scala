package themePark

object sorts extends App {
  
  def bubbleSort[A](arr:Array[A])(lt :(A , A)=> Boolean) :Unit = {
    for(i <- 0 until arr.length - 1 ; j <- 0 until arr.length - 1 - i){
      if(lt(arr(j + 1),arr(j))) {
        val tmp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = tmp
      }
    }  
  }

  /*val nums = Array.fill(10)(math.random)
    println(nums.mkString(","))*/
  
  val ints = Array.fill(10)(util.Random.nextInt(100))
    println(ints.mkString(", "))
    
 /* bubbleSort(nums)(_>_)*/
  bubbleSort(ints)(_<_)
  
/*  println(nums.mkString(","))*/
  println(ints.mkString(", "))
}
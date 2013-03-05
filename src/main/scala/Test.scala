object Test extends App {
	override def main(args: Array[String]) = {
	  val xs = List(99,3,1,9,3,44,0,15,4)
	  println(xs) 
	  val result = MergeSort.sort(xs)
		println(result.toString)
	}
}
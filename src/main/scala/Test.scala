object Test extends App {
	override def main(args: Array[String]) = {
	  val xs = List(99,3,1,9,3,44,0,15,4)
	  println(xs) 
		/**********************
		 * Merge sort
		 **********************/
	  println("Merge sort result: ")
	  var result = MergeSort.sort(xs)
		println(result.toString)
		/**********************
		 * Bubble sort
		 *********************/
		println("Buuble sort result: ")
		result = BubbleSort.sort(xs)
		println(result.toString)
	}
}
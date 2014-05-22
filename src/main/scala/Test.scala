object Test extends App {
  override def main(args: Array[String]) = {
    val xs = List(99, 3, 1, 9, 3, 44, 0, 15, 4)
    val arr = xs.toArray
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
    println("Bubble sort result: ")
    result = BubbleSort.sort(xs)
    println(result.toString)
    /**********************
    * Shell sort
    *********************/
    println("Shell sort result: ")
    println(ShellSort.sort(arr).toString)
  }
}
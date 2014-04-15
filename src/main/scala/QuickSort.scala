object QuickSort {

  def main(args: Array[String]): Unit = {
  	val elements = List(12, 3, 53, 8 , 4, -3, 0, 1, 19, 3)
  	println(sort(elements))
  }

  def sort(xs: List[Int]): List[Int] = {
    xs match {
      case y :: ys => {
        val middleEl = xs.head
        val tail = xs.tail
        val minEls = tail.filter(_ < middleEl)
        val maxEls = tail.filter(_ >= middleEl)
        sort(minEls) ::: (middleEl +: sort(maxEls))
      }
      case Nil => Nil
    }
  }
}
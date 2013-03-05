import scala.annotation.tailrec

object BubbleSort {
	def sort(list: List[Int]) = {
		sortHelper(list, list.length)
	}
	@tailrec
	private	def sortHelper(xs: List[Int], j: Int): List[Int] = {
		if (j == 0) xs
		else {
			val ys = xs.foldLeft (List.empty[Int]) (running(_, _, j))
			sortHelper(ys, j - 1)
		}
	}
	
	private def running(xs: List[Int], el: Int, j: Int) = {
		if (xs.isEmpty) el :: xs
		else if (xs.length >= j) xs :+ el
		else if (xs.last > el) (xs.init :+ el) :+ xs.last
		else xs :+ el						
	}
}
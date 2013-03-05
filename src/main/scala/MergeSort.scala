object MergeSort {
  def sort(list: List[Int]): List[Int] = {
		list match {
			case Nil => Nil
			case x :: Nil => list
			case _ =>
				val middle = 
				  if (list.length % 2 != 0) list.length / 2 + 1
				  else list.length / 2
				val listDiv = list.grouped(middle).toList
				val xs = listDiv.head
				val ys = listDiv.tail.head
				merge(sort(xs), sort(ys))
		}
	}
	private def merge(xs: List[Int], ys: List[Int]): List[Int] = {
		xs match {
			case x :: xt => 
			  ys match {
					case y :: yt =>
						if (x < y) x :: merge(xt, ys)
						else y :: merge(yt, xs)
					case Nil => xs
			}
			case Nil => ys
		}
	}
}
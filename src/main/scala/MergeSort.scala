import scala.annotation.tailrec

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
  
  @tailrec
	private def merge(xs: List[Int], ys: List[Int], acc: List[Int] = List.empty): List[Int] = {
		xs match {
			case x :: xt => 
			  ys match {
					case y :: yt =>
						if (x < y) merge(xt, ys, acc :+ x)
						else merge(yt, xs, acc :+ y)
					case Nil => acc ++ xs 
			}
			case Nil => acc ++ ys
		}
	}
}
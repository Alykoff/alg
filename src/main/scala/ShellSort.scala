import Ordering.Implicits._

object ShellSort {
  def sort[T](xs: Array[T])(implicit order: Ordering[T]): Unit = {
    def less(x: T, y: T): Boolean = order.lt(x, y)
    def exch(i: Int, j: Int): Unit = {
      val temp = xs(i)
      xs(i) = xs(j)
      xs(j) = temp
    }

    val N = xs.length
    var h = 1
    while (h < N/3) h = 3*h + 1
    while (h >= 1) {
      var i = h
      while (i < N) {
        var j = i
        while (j >= h && less(xs(j), xs(j - h))) {
          exch(j, j - h)
          j = j - h
        }
        i = i + 1
      }
      h = h/3
    }
  }
}
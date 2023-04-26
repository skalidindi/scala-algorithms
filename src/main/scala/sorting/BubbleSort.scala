package sorting

import scala.util.control.Breaks._

object BubbleSort {

  def sort(array: Array[Int]): Array[Int] = {
    val n = array.length
    if (n <= 1) return array
    for (x <- array.indices)
      for (y <- 0 until n - x - 1)
        if (array(y) > array(y + 1)) {
          val temp = array(y)
          array(y) = array(y + 1)
          array(y + 1) = temp
        }

    array
  }
}

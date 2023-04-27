package sorting

object SelectionSort {
  def sort(array: Array[Int]): Array[Int] = {
    val n = array.length
    if (n <= 1) return array

    for (x <- array.indices) {
      var minIndex = x
      for (y <- x + 1 until n) {
        if (array(y) < array(minIndex)) {
          minIndex = y
        }
      }
      val temp = array(minIndex)
      array(minIndex) = array(x)
      array(x) = temp
    }

    array
  }
}

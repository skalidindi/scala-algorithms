package sorting

object InsertionSort {
  def sort(array: Array[Int]): Array[Int] = {
    val n = array.length
    for (i <- 1 until n) {
      var j = i - 1
      while (j >= 0 && array(j) > array(j + 1))
        val temp = array(j)
        array(j) = array(j + 1)
        array(j + 1) = temp
        j -= 1
    }
    array
  }
}

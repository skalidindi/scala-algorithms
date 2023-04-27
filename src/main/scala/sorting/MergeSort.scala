package sorting

object MergeSort {
  def sort(array: Array[Int]): Array[Int] = {
    if (array == null)
      throw new IllegalArgumentException("Array cannot be null")

    val n = array.length
    if (n <= 1) return array

    sort(array, 0, n - 1)

    array
  }

  private def sort(array: Array[Int], l: Int, r: Int): Unit = {
    if (l < r) {
      val m = (l + r) / 2
      sort(array, l, m)
      sort(array, m + 1, r)
      merge(array, l, m, r)
    }
  }

  private def merge(array: Array[Int], l: Int, m: Int, r: Int): Unit = {
    val n1 = m - l + 1
    val n2 = r - m

    val left  = array.slice(l, n1 + l)
    val right = array.slice(m + 1, n2 + m + 1)

    var i = 0
    var j = 0
    var k = l

    while (i < n1 && j < n2) {
      if (left(i) <= right(j)) {
        array(k) = left(i)
        i += 1
      } else {
        array(k) = right(j)
        j += 1
      }
      k += 1
    }

    while (i < n1) {
      array(k) = left(i)
      i += 1
      k += 1
    }

    while (j < n2) {
      array(k) = right(j)
      j += 1
      k += 1
    }
  }
}

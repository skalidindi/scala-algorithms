package sorting

object MergeSort {
  def sort(array: Array[Int]): Array[Int] = {
    if (array == null)
      throw new IllegalArgumentException("Array cannot be null")

    val n = array.length
    if (n <= 1) return array

    sort(array, 0, n - 1)
  }

  private def sort(array: Array[Int], l: Int, r: Int): Array[Int] = {
    if (l < r) {
      val m = (l + r) / 2
      sort(array, l, m)
      sort(array, m + 1, r)
      merge(array, l, m, r)
    }

    array
  }

  private def merge(array: Array[Int], l: Int, m: Int, r: Int): Array[Int] = {
    val n1 = m - l + 1
    val n2 = r - m

    val left  = array.slice(l, m + 1)
    val right = array.slice(m + 1, r + 1)

    var i = 0
    var j = 0
    var k = l

    while (k < r + 1) {
      if (i > left.length - 1) {
        array(k) = right(j)
        j += 1
      } else if (j > right.length - 1) {
        array(k) = left(i)
        i += 1
      } else if (left(i) <= right(j)) {
        array(k) = left(i)
        i += 1
      } else {
        array(k) = right(j)
        j += 1
      }
      k += 1
    }

    array
  }
}

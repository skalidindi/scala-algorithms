package search

object BinarySearch {
  def search(array: Array[Int], target: Int): Int = {
    var left  = 0
    var right = array.length - 1

    while (left <= right) {
      val mid = left + (right - left) / 2
      array(mid) match {
        case x if x == target => return mid
        case x if x < target  => left = mid + 1
        case x if x > target  => right = mid - 1
      }
    }

    -1
  }

}

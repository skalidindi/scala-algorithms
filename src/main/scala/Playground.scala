import search.BinarySearch
import sorting.BubbleSort

object Playground {

  def main(args: Array[String]): Unit = {
    val value = BinarySearch.search(Array(5, 9, 29, 90, 66), 90)
    println(value)
  }
}

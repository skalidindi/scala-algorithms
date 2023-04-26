import search.BinarySearch
import sorting.BubbleSort

object Playground {

  def main(args: Array[String]): Unit = {
//    val array         = createArray(10);
//    val originalArray = array.clone();
    val value = BinarySearch.search(Array(5, 9, 29, 90, 66), 90);
    println(value);
//    println(originalArray.mkString(","))
//    println(sortedArray.mkString(","))
//    println(originalArray.sorted.mkString(","))
  }
}

package helpers

object ArrayUtil {
  def create(size: Int): Array[Int] = {
    val MAX_VALUE = 100;
    val array     = new Array[Int](size);
    for (i <- 0 until size)
      array(i) = scala.util.Random.nextInt(MAX_VALUE);
    array;
  }
}

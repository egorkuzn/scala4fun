package first.steps.nums

import scala.math.BigDecimal.RoundingMode

object NumsExample extends App{
  val a = 3
  val b = -5L
  val c = 10.3
  val d: Float = 10.3
  val e = 1.03e-1
  println(e)

  val x = 0xF
  println(s"${x << 1} ${~x}")

  val xLarge = BigInt(10)
  val xDoubleLarge = BigDecimal(10.0)
}

object Test {
  def main(args: Array[String]): Unit = {
    println(crispsWeight(90.0, 0.1, 0.1))
    onesInByteView()
  }

  /**
   * Дано:
   *
   * * weight: BigDecimal  - вес имеющегося картофеля.
   *
   * * potatoWaterRatio: Double  - (0,1), доля воды в картофеле до того, как из него сделали чипсы.
   *
   * * crispsWaterRatio: Double - (0,1), доля воды в чипсах.
   *
   * Найдите массу чипсов, которая получится.
   */
  private def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    def n: BigDecimal = weight * (1.0 - potatoWaterRatio) / (1.0 - crispsWaterRatio)
    n.setScale(5, RoundingMode.HALF_UP)
  }

  /**
   * Посчитайте число единиц в битовой записи числа,
   * считанного с клавиатуры, и выведите на экран.
   */

  import scala.io.StdIn.readInt

  private def onesInByteView(): Unit = {
    var count: Int = readInt()
    var countOfOne: Int = 0

    while (count != 0) {
      countOfOne += count & 1
      count >>>= 1
    }

    println(countOfOne)
  }
}

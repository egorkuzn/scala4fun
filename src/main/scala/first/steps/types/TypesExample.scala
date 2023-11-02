package first.steps.types

object TypesExample extends App {
  val message: String = "Hello, Scala!"
  println(message)

  val messageAnyRef: AnyRef = message
  println(messageAnyRef)

//  val messageAnyRef2: AnyRef = "Hello, Scala"
//  val message2: String = messageAnyRef2 // ошибка компиляции
//  println(message2)
}


object TypesExample2 extends App {
  val res: Double = Math.acos(1.0)
  println(res)

  val resUnit: Unit = Math.acos(1.0)
  // выводит: ()
  println(resUnit)
}

import Math._
object TypesExampe3 {
  def main(args: Array[String]): Unit = {
    println(normalDistribution(0D, 0D, 0D))
  }

  /**
   * Ваша задача - рассчитать плотность вероятности нормального распределения по заданным математическому ожиданию
   *
   * μ, среднеквадратичному отклонению
   *
   * σ и значению случайной величины
   *
   * x
   *
   * @param mu μ
   * @param sigma σ
   * @param x x
   * @return
   */
  private def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    pow(E, -pow((x - mu), 2) / (2 * pow(sigma, 2))) / (sigma * sqrt(2 * PI))
  }
}
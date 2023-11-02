package first.steps.variables

import scala.io.StdIn.readInt

object Main extends App {
  scopeFun()
}

def substruction(): Unit = {
  val first: Int = readInt()
  val second: Int = readInt()

  println(first - second)
}

def multiplication(): Unit = {
  val first: Int = readInt()
  val second: Int = readInt()
  val third: Int = readInt()

  println(first * second * third)
}

def scopeFun(): Unit = {
  val x = 5
  val y = {
    val x = 7
    x + 3
  }
  println(x + "," + y)
}

package first.steps.logic

object LogicExample extends App {
  val isContainsL = "Oleg" contains 'l'
  println(isContainsL)

  val x = "x"
  val y = "y"

  val a = x + y
  val b = x + y

  println(a == b) // true
  println(a eq b) // false
}

object LogicExample1 {
  def main(args: Array[String]): Unit = {
    println(isCapital("Scala", 0))
  }

  def isCapital(word: String, pos: Int): Boolean = {
    word(pos).isUpper
  }
}

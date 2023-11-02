package first.steps.helloworld

import scala.io.StdIn
import scala.io.StdIn.readLine

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val name: String = readLine()
    println(s"Hi, $name!")
  }
}

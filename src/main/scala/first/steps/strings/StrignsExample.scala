package first.steps.strings

object StrignsExample extends App {
  val s: String =
    """
      |Multiline string
      |""".stripMargin

  val s1 = s"$s" // Интерполяция строк
  println(s1)

  val s2 = "aaabbb"
  val booleanVal: Boolean = s2 startsWith "aa" // Проверяется по любому регулярному выражению
  // Regex тип можно получить из "некоторая регулярка".r
  println(booleanVal)
}


/**
 * Cчитайте из консоли два числа: startIndex и endIndex.
 *
 * Они расположены в первой строке и разделены одним пробелом. Далее считайте строку str.
 *
 * Напечатайте в ответ входную строку, обратив порядок символов от startIndex до endIndex включительно.
 */

import scala.io.StdIn._

object StringExample1 {
  def main(args: Array[String]): Unit = {
    val fromTo = readLine().split(" ").map(it => it.toInt)
    val string = readLine()
    println(reversStringFromTo(string, fromTo(0), fromTo(1)))
  }

  private def reversStringFromTo(original: String, from: Int, to: Int): String = {
    val reversedRegion = original.substring(from, to + 1).reverse

    original.substring(0, from) + reversedRegion + original.substring(to + 1)
  }
}


/**
 * Ваша задача - определить, является ли переданная строка input записанной в snake-case стиле.
 *
 * Требовая snake-case к строке:
 *
 * * Должна содержать только строчные латинские буквы и символ подчёркивания
 *
 * * Символ подчёркивания не должен стоять в начале и в конце строки
 *
 * * Два символа подчёркивания не могут стоять рядом
 *
 * Считайте из стандартного потока ввода строку и напечатайте true,
 * если она удовлетворяет требованиям выше, false иначе.
 *
 * Подсказка: возможно, вам пригодятся регулярные выражения.
 */
object StringExample2 {
  def main(args: Array[String]): Unit = {
    val inputString: String = readLine()

    println(inputString matches "([a-z])+(_([a-z])+)*")
  }
}
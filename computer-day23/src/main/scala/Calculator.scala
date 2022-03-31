import scala.io.Source._

object Calculator extends App {

  val path = "C:\\projects\\computer-day23\\instructions.txt"
  val lines = linesFromFile(path)

  def linesFromFile(path: String) = {
    fromFile(path)
      .getLines
      .toSeq
  }

  def calculate(lines: Seq[String]) = {
    lines.foldLeft(0) {
      (result, l) =>
        l(0).toUpper match {
          case 'P' =>
            println(result)
            result
          case '+' => result + l.split("\\W+").drop(1).map(_.toInt).sum
          case '*' => result * l.split("\\W+").drop(1).map(_.toInt).product
          case '/' => result / l.split("\\W+").drop(1).map(_.toInt).product
          case '-' if l.length == 1 => -result
          case '-' => result - l.split("\\W+").drop(1).map(_.toInt).sum
          case _ => result
        }
    }
  }
  calculate(lines)
}
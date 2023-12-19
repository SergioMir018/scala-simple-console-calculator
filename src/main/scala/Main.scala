import Main.{a, b}

object Main extends App {
  private var input: Float = Float.MinValue
  var a: Float = Float.MinValue
  var b: Float = Float.MinValue

  while (input != 0 ) {
    printMenu()

    val userInput = scala.io.StdIn.readLine

    try {
      input = userInput.toFloat
    } catch {
      case e: NumberFormatException => println(s"${Console.RED} Not a number ${Console.RESET}")
    }

    analyzeInput(input)
    }

  println("Exited from calculator")
}

def printMenu(): Unit = {
  if (a != Float.MinValue && b != Float.MinValue) {
    print(
      s"""
        |The assigned values are
        |a=$a
        |b=$b
        |-------------------------
          """.stripMargin)
  }

  println("Choose an operation:")
  println("1- Define values")
  println("2- Sum")
  println("3- Subtraction")
  println("4- Multiplication")
  println("5- Division")
  println("0- Exit")
  println("")
  print("user > ")
}

def analyzeInput(input: Float): Unit = {
  val calculator = new Calculator

  input match {
    case 1 =>
      println("-------------------------")
      print("Define the value of the a: ")
      val aInput = scala.io.StdIn.readLine
      
      try {
        a = aInput.toFloat
      } catch
        case e: NumberFormatException => println(s"${Console.RED} Not a number ${Console.RESET}")

      print("Define the value of the b: ")
      val bInput = scala.io.StdIn.readLine

      try {
        b = bInput.toFloat
      } catch
        case e: NumberFormatException => println(s"${Console.RED} Not a number ${Console.RESET}")
    case 2 =>
      val result = calculator.sum(a, b)
      println("-------------------------")
      println(s"The result of the sum is: $result")
    case 3 =>
      val result = calculator.sub(a, b)
      println("-------------------------")
      println(s"The result of the subtraction is: $result")
    case 4 =>
      val result = calculator.mult(a, b)
      println("-------------------------")
      println(s"The result of the multiplication is: $result")
    case 5 =>
      val result = calculator.div(a, b)
      println("-------------------------")
      println(s"The result of the division is: $result")
    case _ =>
      if (input != 0) {
        println(s"${Console.YELLOW} Please enter a valid option ${Console.RESET}")
      }
  }
}
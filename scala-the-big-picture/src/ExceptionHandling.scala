object ExceptionHandling extends App{

  def exceptionCheck() {
    try {
      10/0
    }
    catch {
      case ex:ArithmeticException => println("Exception is Generated")
    }
  }
  exceptionCheck()
}

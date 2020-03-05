object ExceptionHandling extends App{
  import scala.util.Try

  def exceptionCheck()
  {
    try{
      10/0
    }
    catch {
      case ex:ArithmeticException => println("Exception is Generated")
    }

  }

  println(exceptionCheck())

}

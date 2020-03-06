// Main is the Singleton object here
// Extending with App defines the entry point of program

object SingletonObject extends App {
  println("The sum is " + getSum(5, 10))

  def getSum(a: Int, b:Int) = a + b
}

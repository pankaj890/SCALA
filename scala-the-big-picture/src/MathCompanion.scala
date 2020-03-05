// Object Companion
object MathCompanion extends App{
  def sum(a: Int, b: Int): Int = a + b
  def getPrivateMember: Int = new MathCompanion().max
  def apply() = new MathCompanion()
}

class MathCompanion {
  private val max = 100
  def product(a:Int, b:Int): Int = a * b
}

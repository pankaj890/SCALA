// Object Companion
object CompanionObject extends App{
  def sum(a: Int, b: Int): Int = a + b
  def getPrivateMember: Int = new CompanionObject().max
  def apply() = new CompanionObject()
}

class CompanionObject {
  private val max = 100
  def product(a:Int, b:Int): Int = a * b
}

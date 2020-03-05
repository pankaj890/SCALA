object func extends App{

  //Function with Single Argument
  def addOneZero(number :Int) = {
    if (number < 0) 0
    else number + 1
  }

  //Function with Multiple Argument
  def product(a :Int, b :Int) ={
    if (a == 0 || b == 0) 0
    else a * b
  }

  //Anonymous Function or Function Literal
  val anon_0 = (a :Int) => a + 1

  val anon_1 = (a :Int, b :Int) => a * b

  val anon_2 = (a :Int, b :Int) => {
    if (a == 0 || b == 0) 0
    else a * b
  }

  // Higher Order Functions
  var fruitBasket = List("Apple","Orange","Mango")

  // Filter Funtion
  // fruitBasket.filter(fruitBasket == "Apple")

  // Normal Functions calls
  //println(addOneZero(99))
  //println(product(2, 0))

  // Anonymous Functions calls
  println(anon_0(8))
  println(anon_1(3, 4))
  println(anon_2(2, 0))
}

object Hello extends App {
  println("This is my new program from IDE")

  // Conditional Statements
  var arg = Array("Monday")

  if (!arg.isEmpty)
    println(arg(0))
  else
    println("Sunday")

  // For Loop
  val letters = List("a","b","c")
  for (letter <- letters) {
    println(letter)
  }

  // FOR Loop with IF
  val numbers = List(1,2,3,4)
  for (number <- numbers) if (number % 2 == 0) {
    println(number)
  }

  // FOR loop - Nested
  for {
    number <- numbers
    letter <- letters
  } println(number + " " + letter)
}


object NullHandling extends App {

  val s = Set("Pankaj", "Goyal")

  // OPTION Some or None
  println(s.find(_ == "Pankaj"))
  println(s.find(_ == "random"))

  println(s.find(_ == "Pankaj").get)
  println(s.find(_ == "random").getOrElse("NOT FOUND"))
}

object while_loop extends App {

  // Define variables for while loop
  var i = 0
  val numRepetitions = 3

  // Loop the repeat
  while (i < numRepetitions) {
    println("Hip hip hooray!")
    i = i + 1
  }

  // Define a function
  def bust(n: Int): Boolean = {
    if (n > 21) true
    else false
  }

  // Define variables and create an array
  var j = 0
  var hands = Array(17, 24, 21)

  // Loop through hands and see if each busts
  while (j < hands.length) {
    println(bust(hands(j)))
    j += 1
  }





}

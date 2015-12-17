// Updated switch block to use charAt for operation selection
println ""
println "CALCULATOR PROGRAM"
double num1, num2
boolean nomore = false
while (!nomore) {
  println ""
  println "Enter 1st number"
  num1 = Double.parseDouble(System.console().readLine())
  println "enter 2nd number"
  num2 = Double.parseDouble(System.console().readLine())
  println "Choose a mathematical operation..."
  println "ADDITION (A), SUBTRACTION (S), MULTIPLICATION (M) or DIVISION (D)"
  calc = (System.console().readLine()).charAt(0)
  switch (calc) {
    case "A":
      println num1 + " + " + num2 + " = " + (num1 + num2)
      break
    case "S":
      println num1 + " - " + num2 + " = " + (num1 - num2)
      break
    case "M":
      println num1 + " * " + num2 + " = " + (num1 * num2)
      break
    case "D":
      println num1 + " / " + num2 + " = " + (num1 / num2)
      break
    default:
      println "Sorry - not a valid option!"
      break
  }
  println "Enter 0 to stop or 1 to try more numbers"
  stop = Integer.parseInt(System.console().readLine())
  if (stop == 0) {
    break
  }
}


	




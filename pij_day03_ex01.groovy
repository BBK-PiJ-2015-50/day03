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
  println "ADDITION (1), SUBTRACTION (2), MULTIPLICATION (3) or DIVISION (4)"
  calc = Integer.parseInt(System.console().readLine())
  switch (calc) {
    case 1:
      println num1 + " + " + num2 + " = " + (num1 + num2)
      break
    case 2:
      println num1 + " - " + num2 + " = " + (num1 - num2)
      break
    case 3:
      println num1 + " * " + num2 + " = " + (num1 * num2)
      break
    case 4:
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


	




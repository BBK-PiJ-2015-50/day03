// Updated switch block to use charAt for operation selection
println ""
println "CALCULATOR PROGRAM"
double num1, num2
enum MathematicalOperation {ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION}
MathematicalOperation calc
//boolean nomore = false
while (true) {
  println ""
  println "Enter 1st number"
  num1 = Double.parseDouble(System.console().readLine())
  println "enter 2nd number"
  num2 = Double.parseDouble(System.console().readLine())
  println "Choose a mathematical operation..."
  println "ADDITION, SUBTRACTION, MULTIPLICATION or DIVISION"
  calc = MathematicalOperation.valueOf(System.console().readLine().toUpperCase())
  switch (calc) {
    case MathematicalOperation.ADDITION:
      println num1 + " + " + num2 + " = " + (num1 + num2)
      break
    case MathematicalOperation.SUBTRACTION:
      println num1 + " - " + num2 + " = " + (num1 - num2)
      break
    case MathematicalOperation.MULTIPLICATION:
      println num1 + " * " + num2 + " = " + (num1 * num2)
      break
    case MathematicalOperation.DIVISION:
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


	




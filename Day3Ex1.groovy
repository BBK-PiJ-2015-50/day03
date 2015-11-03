println ("enter 1st number");
double num1 = readDouble();
println ("1st number is " + num1);
println ("enter 2nd number");
double num2 = readDouble();
println ("2nd number is " + num2);
println ("Choose a mathematical operation");
println ("ADDITION (1), SUBTRACTION (2), MULTIPLICATION (3) or DIVISION (4)");
int calc = readInt();
switch (calc) {
  case 1:
    println ("addition");
    println (num1 + " + " + num2 + " = " + (num1 + num2));
    break;
  case 2:
    println ("subtraction");
    break;
  case 3:
    println ("multiplication");
    break;
  case 4:
    println ("division");
    break;
  default:
    break;
}

	




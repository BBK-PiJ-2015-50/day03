double xco, yco
String inside
boolean nomore = false
while (!nomore) {
	println""
	println "ANOTHER RECTANGLE PROGRAM: is the 3rd point inside?"
	println ""
	println "Enter x co-ordinate for top left corner: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for top left corner: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt1 = new Point()
	pt1.x = xco
	pt1.y = yco
	println "Enter x co-ordinate for bottom right corner: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for bottom right corner: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt2 = new Point()
	pt2.x = xco
	pt2.y = yco
	Rectangle rect = new Rectangle()
	rect.upLeft = pt1
	rect.downRight = pt2
	println "Enter x co-ordinate for 3rd point: "
	xco = Double.parseDouble(System.console().readLine())
	println "Enter y co-ordinate for 3rd point: "
	yco = Double.parseDouble(System.console().readLine())
	Point pt3 = new Point()
	pt3.x = xco
	pt3.y = yco
	// check 3rd point is within width & height of rectangle
	inside = ((pt3.x>=rect.upLeft.x && pt3.x<=rect.downRight.x) && (pt3.y>=rect.downRight.y && pt3.y<=rect.upLeft.y)) ? "inside" : "outside"
	println ""
	println "The 3rd point is " + inside + " the rectangle"
	println""
    println "Enter 0 to stop or 1 to run again with new co-ordinates"
    stop = Integer.parseInt(System.console().readLine())
    if (stop == 0) {
    	nomore = true
    }
}   

class Point {
	double x
  	double y
}
class Rectangle {
  	Point upLeft
  	Point downRight
}
package kg_q;

public class Circle {
public double radius;
public Circle(double radius){
	this.radius=radius;
}
public void areaOfCircle() {
	double area =Math.PI*radius*radius;
	System.out.printf("area of circle is: %f ",area);
}
}

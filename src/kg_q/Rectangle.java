package kg_q;

public class Rectangle {
double lenght;
double breadth;
public Rectangle(double lenght,double breadth){
	this.lenght=lenght;
	this.breadth=breadth;
}
public void areaOfRectangle() {
	double area=lenght*breadth;
	System.out.printf("area of rectangle %f",area);
}
}

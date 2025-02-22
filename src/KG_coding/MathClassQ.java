package KG_coding;

public class MathClassQ {
   void area(int r) {
	   System.out.println("area of circle ="+Math.PI*r*r);
   }
   void circumference(int r) {
	   System.out.println("circumference is ="+2*Math.PI*r);
   }
	public static void main(String[] args) {
		MathClassQ m=new MathClassQ();
		m.area(5);
		m.circumference(10);
	}

}

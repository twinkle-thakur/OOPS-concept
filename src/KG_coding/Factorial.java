package KG_coding;

public class Factorial {
  static int  factorial(int num) {
	   if(num==0||num==1) {
		   return 1;
	   }
	   return num*factorial(num-1);
   }
	public static void main(String[] args) {
		System.out.println("factorial is:" +factorial(0));
	}

}

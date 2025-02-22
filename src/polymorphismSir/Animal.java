package polymorphismSir;

public class Animal {
	//overriden
   public void eat() {
	   System.out.println("eat meat");
   }
   void speak() {
	   System.out.println("bark");
   }
   protected Object getName() {
	   return "moti";
   }
   public Integer getAge() {
	   return 10;
   }
   
   public static void sleep(int hour,String place) {
	   System.out.println(hour+" "+place);
   }
   public final void sleep(int hour) {
	   System.out.println(hour);
   }
}

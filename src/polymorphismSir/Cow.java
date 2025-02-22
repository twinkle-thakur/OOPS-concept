package polymorphismSir;

public class Cow extends Animal {
	@Override
	public void eat() {
		System.out.println("grass");
	}
//void speak() to override this
	@Override
	public void speak() {
		System.out.println("mowww..");
	}
//	protected Object getName()
	@Override
	public String getName(){
		return "rampyari";
	}
//public Integer getAge()
  public Integer getAge(){
	return 20;	
	}
 // public static void sleep(int hour,String place)
//  @Override
//  public static void sleep(int hour,String place) {
//	 we cant override static method
//  }
//  public final void sleep(int hour) {
//	we cant override final method  
//  }
//}

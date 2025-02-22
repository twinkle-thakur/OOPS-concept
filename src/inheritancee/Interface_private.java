package inheritancee;
interface P1{
	public static void call() {
		add(10,12);
	}
	private static void add(int x,int y) {
		System.out.println(x+y);
	}
}
class q implements P1{
	public void sub(int x,int y) {
		System.out.println(x-y);
	}
}
public class Interface_private {

	public static void main(String[] args) {
		q r=new q();
		r.sub(100, 10);
		
	}

}

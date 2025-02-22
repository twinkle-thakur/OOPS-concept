package inheritancee;
interface X{
	void show();
}
interface W{
	void disp();
}
class multi implements X,W{
	public void show() {
	System.out.println("X interface");	
	}
	public void disp() {
		System.out.println("Y interface");
	}
}
public class Multiple_using_interface_2 {

	public static void main(String[] args) {
		multi m=new multi();
		m.show();
		m.disp();
	}

}

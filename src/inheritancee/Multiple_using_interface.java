package inheritancee;
interface Z{
	void show();
}
interface Y{
	void show();
}
class multiple implements Z,Y{
	public void show() {
		System.out.println("interface Z and Y");
	}
}
public class Multiple_using_interface {

	public static void main(String[] args) {
		multiple m=new multiple();
		m.show();
	}

}

package inheritancee;
interface A2{
	public static void show() {
		System.out.println("can't overriden");
	}
}
public class Interface_static_2 {

	public static void main(String[] args) {
		A2.show();
	}

}

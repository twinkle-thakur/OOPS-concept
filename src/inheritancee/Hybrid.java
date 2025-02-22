package inheritancee;
class F{
	void input() {
		System.out.println("enetr your name");
	}
}
class G extends F{
	void show() {
		System.out.println("my name is khushi");
	}
}
class H extends F{
	void disp() {
		System.out.println("my name is twinkle");
	}
}
public class Hybrid {
public static void main(String[] args) {
	G g=new G();
	H h=new H();
	g.input();
	g.show();
	h.input();
	h.disp();
}
}

package Interface;
//benefits of interface
//1)flexibility=apne hisab se method modify kr skte hai
//2)code reusability
public class Twinkle implements Dancable,Speakable{

	@Override
	public void mydance() {
		System.out.println("twinkle dance");
	}

//	@Override
//	public void mySpeak() {
//		System.out.println("twinkle speak");
//	}
public static void main(String[] args) {
	Twinkle t=new Twinkle();
	t.bollywoodDance();
	t.mySpeak();
}
}

package abstraction;

import java.util.Scanner;

interface client {
	void input();

	void output();
}

class A implements client {
	int sal;
	String name;
@Override
	public void input() {
		System.out.println("enter user name ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("enter salary ");
		sal = sc.nextInt();
		sc.close();
	}

	@Override
	public void output() {
		System.out.println(name + " " + sal);
	}
}

public class Interface {

	public static void main(String[] args) {
		A a1 = new A();
		a1.input();
		a1.output();
	
	}

}

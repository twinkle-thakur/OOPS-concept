package encapsulation;

public class Student {
private String name;
private int age;


public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	if(0<age) {
		this.age=age;
	}
	else
	System.out.println("invalid age");
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}

}

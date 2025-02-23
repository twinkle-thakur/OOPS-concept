package encapsulation;

public class StudenTest {
public static void main(String[] args) {
	Student student=new Student();
	student.setName("twinkle");
	student.setAge(21);
	System.out.println("age :"+ student.getAge());
	System.out.println("name :"+student.getName());
}
}

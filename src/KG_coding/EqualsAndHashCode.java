package KG_coding;

public class EqualsAndHashCode {
//Person class
	
	String Name;
	int age;
	
	public EqualsAndHashCode(String name, int age) {
		
		Name = name;
		this.age = age;
	}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
	public static void main(String[] args) {
		EqualsAndHashCode p1=new EqualsAndHashCode("khushi",21);
		EqualsAndHashCode p2=new EqualsAndHashCode("khushi",21);
		
	}
}

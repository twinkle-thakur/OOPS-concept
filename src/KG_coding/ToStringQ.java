package KG_coding;
//define student class
public class ToStringQ {
    int age;
    String name;
    
	

	public ToStringQ(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student details:- \n name= "+name+", age="+age+"";
		//or
	//return "Student details" + "\nname ="+name +",age="+age; 	
	} 
  
		public static void main(String[] args) {
		ToStringQ q=new ToStringQ(21,"khushi");
		System.out.println(q);
	}
	

}  

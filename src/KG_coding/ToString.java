package KG_coding;

public class ToString {
   //for car we may have
	int noOfWheel;
	int maxSeat;
	String colour;
	String name;
	
	public ToString(int noOfWheel, int maxSeat, String colour, String name) {
		
		this.noOfWheel = noOfWheel;
		this.maxSeat = maxSeat;
		this.colour = colour;
		this.name = name;
	}
    @Override
	public String toString() {
		return "ToString [noOfWheel=" + noOfWheel + ", maxSeat=" + maxSeat + ", colour=" + colour + ", name=" + name
				+ "]";
	}
    
	public static void main(String[] args) {
		ToString swift=new ToString(4,4,"pink","swift");
		System.out.println(swift.toString());//it will give some hashcode
		//but if we want that whenever we will cal toString the String 
		//representation of the ovject should be provided
		//for that we have to define toString method otherwise it will
		//give by default value that is hashcode when toString is not defined
		//because it is inherited in every class by default
		//but to get details that we will want to show to the user that we 
		//will define in toString() and which we want to hide from user
		//we will not wirte in toString() by default when we will call 
		//toString() it will give hash code 
//like bank account by default we dont want to show so it shows ***
		System.out.println(swift);//without toString also by default it will call
	}

}

package KG_coding;

public class Inheritance {
//libraryItem class
	String itemID;
	String title;
	String author;
	public void checkout(){
		
	}
    public void returnItem(){
		
	}
   }
class Books extends Inheritance{
	String ISBN;
}
class Magazine extends Inheritance{
	int issueNumber;
}
class Dvd extends Inheritance{
int duration;	
}

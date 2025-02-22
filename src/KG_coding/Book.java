package KG_coding;

public class Book {
static int totalBooks;
String title;
String author;
String isbn;
boolean isBorrowed;
static {
	totalBooks=0;
}
{
	totalBooks++;
}
Book(String title,String author,String isbn){
	this.title=title;
	this.author=author;
	this.isbn=isbn;
}
Book(String isbn){
	this(isbn,"unknown","unknown");
}
static int getTotalBooks(){
	
	return totalBooks;
}

public void borrowBook() {
	if(isBorrowed) {
		System.out.println("book is alredy borrowed");
	}
	else {
		this.isBorrowed=true;
		System.out.println("book borrowed");
		
	}
	
}
public void returnBook() {
	if(isBorrowed) {
		isBorrowed=false;
		System.out.println("book returned");
			
	}
	else {
		System.out.println("already in library");
	}
}
public static void main(String[] args) {
	//Book b=new Book("1","khushi","my");
	//Book b2=new Book("1");
	
}
}

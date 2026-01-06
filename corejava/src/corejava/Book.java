package corejava;

public class Book {
	static String libraryname;
	String title;
	String author;
 Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	public void displayInfo() {
		System.out.println("library name :"+libraryname);
		System.out.println("book title :"+title);
		System.out.println("book author :"+author);
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		libraryname="City Public library";
		Book book1= new Book("The great gastby","F.Scott fitgerald");
		Book book2= new Book("1984","george orwell");
		book1.displayInfo();
		book2.displayInfo();
		

	}

}

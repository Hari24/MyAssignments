package week2.day1;

public class Library {
   public String addBook(String bookTitle) {
	   System.out.println("Book added successfully");
	   return bookTitle;
   }
   
   public void issueBook() {
	   System.out.println("Booked issued successfully");
   }
	public static void main(String[] args) {
		String str1;
		Library lib = new Library();
		
		str1=lib.addBook("Java for Beginners");
		System.out.println("Book added is: "+str1);
		
		lib.issueBook();  
		

	}

}

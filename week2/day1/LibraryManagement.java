package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library library = new Library();
		String str2= library.addBook("Java for advanced users");
		System.out.println(str2);
		library.issueBook();

	}

}

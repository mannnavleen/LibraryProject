/**
 * 
 */
package LibraryProject;

import java.util.ArrayList ;

/**
 * @author navleenmann
 *
 */
public class BookDriver { 
	
	public static void main() { 
		
		// Step 1: Create book object
		Book book1 = new Book() ; 
		
		//Book 1: Curious George 
		book1.title = "Curious George" ; 
		book1.author = "H. A. Ray" ; 
		book1.genre = "Children' Book" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book1) ; 
		
		// Book 2: Green Eggs and Ham 
		Book book2 = new Book() ; 
		
		book2.title = "Green Eggs and Ham" ; 
		book2.author = "Dr. Seuss" ; 
		book2.genre = "Children's Book" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book2) ; 

		// Book 3: The Great Gatsby 
		Book book3 = new Book() ; 
		
		book3.title = "The Great Gatsby" ; 
		book3.author = "F. Scott Fitzgerald" ; 
		book3.genre = "Romance" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book3) ; 

		// Book 4: Harry Potter and the Goblet of Fire 
		Book book4 = new Book() ; 
		
		book4.title = "Harry Potter and the Goblet of Fire" ; 
		book4.author = "J.K. Rowling" ; 
		book4.genre = "Sci-Fi" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book4) ; 

		// Book 5: Harry Potter and the Deathly Hollows 
		Book book5 = new Book() ; 
		
		book5.title = "Harry Potter and the Deathly Hollows" ; 
		book5.author = "J. K. Rowling" ; 
		book5.genre = "Sci-Fi" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book5) ; 
		
		// Book 6: Shades of Grey 
		Book book6 = new Book() ; 
		
		book6.title = "Shades of Grey" ; 
		book6.author = "Jasper Fforde" ; 
		book6.genre = "Sci-Fi" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book6) ; 
		
		// Book 7: The Hobbit 
		Book book7 = new Book() ; 
		
		book7.title = "The Hobbit" ; 
		book7.author = "J. R. R. Tolkien" ; 
		book7.genre = "Fantasy" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book7) ; 
		
		// Book 8: American Gods 
		Book book8 = new Book() ; 
		
		book8.title = "American Gods" ; 
		book8.author = "Neil Gaiman" ; 
		book8.genre = "Fantasy" ; 
		
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book8) ; 

		// Book 9: Dune 
		Book book9 = new Book() ; 
			
		book9.title = "Dune" ; 
		book9.author = "Frank Herbert" ; 
		book9.genre = "Fantasy" ; 
			
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book9) ;
		
		// Book 10: Uprooted 
		Book book10 = new Book() ; 
			
		book10.title = "Uprooted" ; 
		book10.author = "Naomi Novik" ; 
		book10.genre = "Fantasy" ; 
			
		ArrayList<Book> bookList = new ArrayList<Book>() ; 
		bookList.add(book10) ;
		
	}

}
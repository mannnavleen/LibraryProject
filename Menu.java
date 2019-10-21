/**
 * 
 */
package LibraryProject;

import java.util.Scanner;

/**
 * @author navleenmann
 *
 */
public class Menu {
	
	Scanner input = new Scanner(System.in) ;
	
	while() { 
		
		System.out.println("Inventory of the Library") ; 
		System.out.println("Select one of the books") ; 
			
		int option = input.nextInt() ; 
		input.nextLine() ;
			
		switch(option) {
			
		case 1: 
			System.out.println("Curious George") ; 
			break ; 
				
		case 2:
			System.out.println("Green Eggs and Ham") ; 
			break ;
				
		case 3: 
			System.out.println("The Great Gatsby") ; 
			break ; 
				
		case 4:
			System.out.println("Harry Potter and the Goblet of Fire") ;
			break ; 
				
		case 5: 
			System.out.println("Harry Potter and the Deathly Hollows") ; 
			break ; 
				
		case 6: 
			System.out.println("Shades of Grey") ; 
			break ; 
				
		case 7: 
			System.out.println("The Hobbit") ; 
			break ; 
				
		case 8:
			System.out.println("American Gods") ; 
			break ; 
				
		case 9: 
			System.out.println("Dune") ; 
			break ; 
				
		case 10: 
			System.out.println("Uprooted") ; 
			break ; 
		
		}
		
	}
	
}
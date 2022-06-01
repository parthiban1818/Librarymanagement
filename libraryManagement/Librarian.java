package libraryManagement;

import java.util.Scanner;

public class Librarian { 
	Scanner sc =new Scanner(System.in);
	Books book =new Books();
	public void librarian() {
	   while(true) {
		 System.out.println("\n<press 1> for login"); 
		 System.out.println("<press 2>log out");
		 int choice =sc.nextInt();
		 switch(choice) {
		 case 1:book.maintain();break;  
		 case 2:{
			 System.out.println("\nyou are succesfully logged out\n");
			 Main.main(null); 
			 } 
		 default :
			 System.err.println("you entered wrong input");
		 }
	 }  
  }
	
}

package libraryManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in); 
		 System.out.println("welcome to Z-library\n"); 
          while(true) {
        	  System.out.println("\n<press 1>if you are a librarian");
              System.out.println("<press 2> if you are a user");
              System.out.println("<press 3> close this site");
              int button =sc.nextInt();
        	   switch(button) {
        	   case 1:new Librarian().librarian();break;
        	   case 2:{
        		   System.out.println("enter user id");
        		   int uId=sc.nextInt();
        		  User.user(uId);
        		  break;
        		  }
        	   case 3:{
        		   System.out.println("\nThanks.visit again!\n");
        		   System.exit(0);
        	   }
        	   default :
        		   System.err.println("\nyou entered wrong input\n");
        	   }  
          } 
	} 
}

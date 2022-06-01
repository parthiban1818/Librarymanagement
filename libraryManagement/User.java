package libraryManagement;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class User {
	static Scanner sc=new Scanner(System.in);
	static LinkedHashMap<Integer, String> userDetail=new LinkedHashMap();
	  public static void user(int id) {
		  if(userDetail.containsKey(id)){
		  while(true) {
			  System.out.println("\nwelcome back "+id+"\n");
			  System.out.println("<press 1> for to view all books");
			  System.out.println("<press 2> for to check the book is available or not");
			  System.out.println("<press 3> for log out");
			  int button=sc.nextInt();
			  switch(button) {
			  case 1:new Books().viewAllBooks();break;
			  case 2:{
				  System.out.println("enter book id");
				  int bId =sc.nextInt();
				  Issue.availableOrNot(bId);
				  break;
			  }
			  case 3:{
					 System.out.println("\nyou are succesfully logged out\n");
					  Main.main(null);
					 }
			  default :
       		   System.err.println("\nyou entered wrong input\n");
			  }
		  }
	  }
		  else
			  System.out.println("\nSORRY!you are not a user of this library\n");
	}
	  public void addUser() {
		   System.out.println("enter user id");
		   int newId=sc.nextInt();
		   if( userDetail.containsKey(newId))
			   System.out.println("\n Id already exists please enter new id");
		   else {
		   System.out.println("enter user name");
		   String newName=sc.next();
		    userDetail.put(newId, newName);
		    System.out.println("\nuser details added succesfully\n");
		   }
	   }
	  public void viewAllUsers() {
		  if(userDetail.isEmpty())
			  System.err.println("\nUser detail is empty\n");
		  else {
			  for(Entry<Integer, String> u : userDetail.entrySet()) {
				  System.out.println("\n"+u.getKey()+"->"+u.getValue());
			  }
		  }
	  }
	  public void deleteUser(int uId) {
		  if(userDetail.isEmpty())
			  System.out.println("\n user detail is already empty");
		  else {
			  userDetail.remove(uId);
			  System.out.println("\n user is removed");
		  }
	  }
	  
}

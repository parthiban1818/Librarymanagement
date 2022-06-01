package libraryManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Books {
	
	Scanner sc=new Scanner(System.in);
	static HashMap <Integer,String> books =new HashMap();
	User user=new User(); 
     public void maintain() {
    	 while(true) {
    	System.out.println("\n<press 1> for add new book");
    	System.out.println("<press 2> for  delete the book");
    	System.out.println("<press 3> for view all books"); 
    	System.out.println("<press 4> for to chech if the book is available or not");
    	System.out.println("<press 5> for add user");
    	System.out.println("<press 6> for view all users");
    	System.out.println("<press 7> for delete a user");
    	System.out.println("<press 8> for issue book");
    	System.out.println("<press 9> for issued book list");
    	System.out.println("<press 10> for log out "); 
		int n=sc.nextInt();
		switch(n) {
		case 1:addNewBook();break;
		case 2:deleteBook();break;
		case 3:viewAllBooks();break;
		case 4:{
		 System.out.println("enter book id");
		  int bId =sc.nextInt();
		  Issue.availableOrNot(bId);
		  break;
		 }
		case 5:{
			user.addUser();
			break;
		}
		case 6:user.viewAllUsers();break;
		case 7:{
			System.out.println("enter user ID");
			int uId=sc.nextInt();
			user.deleteUser(uId);
			break;
		}
		case 8:{
			System.out.println("enter book id");
			int bId=sc.nextInt();
			System.out.println("enter user id");
			int uId=sc.nextInt();
			Issue.issue(bId, uId);
			break;
		}
		case 9: 
			Issue.issuedBook();
			break; 
		case 10:{
			System.out.println("\nyou are logged out\n");
			Main.main(null);
			break;
			}
		default :
 		   System.err.println("\nyou entered wrong input\n");
		}
		}
	  } 
	 
	public void addNewBook() {
		System.out.println("enter book id");
		int bId=sc.nextInt();
		if(books.containsKey(bId))
			System.err.println("book ID already exists");
		else {
		System.out.println("enter book name");
		String bName=sc.next(); 
		 books.put(bId,bName);
		}
	}
	public void deleteBook() {
		 System.out.println("enter book id");
		 int id=sc.nextInt();
		 if(books.containsKey(id)) {
			 books.remove(id);
			 System.out.println(id+" is deleted");
		 }
		 else
			 System.err.println("\nno book avalable from this id:"+id+"\n");
	}
	public void viewAllBooks() {
		if(books.isEmpty())
			System.err.println("\nthere is no book in this library\n");
		else {
		for(Entry<Integer, String> b : books.entrySet()) {
			System.out.println(b.getKey()+"->"+b.getValue() );
		}
		}
	}

}

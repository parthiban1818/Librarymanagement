package libraryManagement;

import java.util.LinkedHashMap;
import java.util.Map;

public class Issue {
      static LinkedHashMap <Integer,Integer>issuedBook=new LinkedHashMap();
	 public static void issue(int bId,int uId) {
		 if(User.userDetail.containsKey(uId)) {
			 if(Books.books.containsKey(bId)) {
				 issuedBook.put(bId,uId);
				 System.out.println(bId+" issued to "+uId); 
				 Books.books.remove(uId);
			 }
			 else 
				 System.out.println("\nSORRY!.this book is not available now\n");
		 }
		 else
			 System.out.println("\nSORRY!. you not a user of our library\n");
	 }
     public static void availableOrNot(int bId) {
    	 if(Books.books.containsKey(bId)) 
			 System.out.println("\nbook is available\n"); 
		 else 
			 System.out.println("\nSORRY!.this book is not available now\n");
     }
     public static void issuedBook() {
    	 if(issuedBook.isEmpty())
    		 System.out.println("there is no book issued");
    	 else {
    	 for(Map.Entry<Integer, Integer> o: issuedBook.entrySet()) {
    		 System.out.println("book Id:"+o.getKey()+"->user id:"+o.getValue()); 
    	 }
    	 }
     }
}

package link;
//Package is a grouping of related types providing access protection and name

import java.util.*;

public class LinkedListExample { //created class as LinkedListExample
	//public keyword is used in the declaration of a class,method or 
		//field;public classes,method and fields can be accessed by the 
		//members of any class.
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class
	public static void main(String[] args) { //created main method
		 //static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
						
        LinkedList<String> studentname = new LinkedList<>();      //created an interface for studentnamelist of type string for linkedList
        
		  studentname.add("Priya"); //initializing elements and creating the studentnamelist objects for the list
		  studentname.add("Anika");
		  studentname.addLast("Gauri");
		  studentname.addFirst("Bhavya");
		  studentname.add("Meera");
		  System.out.println("The elements of linked list are : " ); 
               Iterator<String> iterator=studentname.iterator();            //traversing the elements of the object list  by using iterator method
		  
               //while loop is used to iterate a part of the program several times
               while(iterator.hasNext()){       //implementing the for each loop to traverse the elements
			  
		   System.out.println(iterator.next());  
		 //system is final class
		      //out is a static member of system class and type printStream
		      //println is method of printStream class.ln means nextline
		    
		  }
		 
		         List<String> list = new ArrayList<>();   // adding the arrayList objects at the end of the linked list 
		
		  list.add("nisha");
		  list.add("vidha");
		  studentname.addAll(list); //here list.addAll() this method add  the two objects list elements and prints the values
		
		  System.out.println("The elements after joining the arraylist are : " +list); 
		  
		    ListIterator<String> listIterator=studentname.listIterator();    //here it shows all the elements which are also added 
	        while(listIterator.hasNext()){                      //and displays the elements by the iterator
	        
		   System.out.println(listIterator.next());  

		  }
		 
		    System.out.println("Traversing elements in backward direction...");    //here iterating the by reverse direction 
		  while( listIterator.hasPrevious()){   //this method will displays the elements in the backward direction 
			  
			   System.out.println( listIterator.previous());   //and prints the values

		  }
		  }  
}
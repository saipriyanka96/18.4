package link;
//Package is a grouping of related types providing access protection and name
import java.util.LinkedList; 
import java.util.Queue;

public class LinkedListFIFO { //created class LinkeListFIFO
	//public keyword is used in the declaration of a class,method or 
			//field;public classes,method and fields can be accessed by the 
			//members of any class.
			//class defines instance and class fields,methods and inner classes as
			//well as specifying the interfaces the class implements and the 
			//immediate superclass of the class	
	 public static void main(String args[]){ //created main method
		 //static is used for memory management
			//void is used to define the return type of the method
			//String[] args is actually an array of java.lang.String type and it's name is args here    
		   //public interface Queue<E> extends Collection<E>  by using this we declare the queue in linked list
	        Queue<String> myQueuelist = new LinkedList<String>();
	   //here created LinkedList  of string type implementing queue
	        myQueuelist.add("Pallavi");     
	        //inserting elements in the myqueuelist objects 
	        myQueuelist.add("Sruthi");
	        myQueuelist.add("Indira");
	        myQueuelist.offer("Karuna");
	         
	        for(String element : myQueuelist){                   
//  here it  inserts the specified element into the queue by using the
	       //for each loop and prints the elements in the myqueuelist
	            System.out.println("Elements are : " + element);
	        }
	        
	        System.out.println("Queue : " + myQueuelist);        
	        // element() this method retrieves the head of the queue.
	        
	        System.out.println(myQueuelist.peek());                     
	        // here this peek() method retrieves the head of this queue, returning null if this queue is empty.
	        System.out.println("After peek : " + myQueuelist);
	        
	        System.out.println(myQueuelist.poll());
	        System.out.println("After poll : " + myQueuelist);          
	        // this poll() method retrieves and removes the head of this queue or it  return null if this queue is empty.
	        
	        System.out.println(myQueuelist.remove());                 
	        // here this remove() method retrieves and removes the head of this queue.
	        
	        System.out.println("After remove : " + myQueuelist); 
	        //here first it checks the elements and remove the first element by peek method of the queue and makes it as empty
	            
	    }                                                        
	 //after that  it pull the second element to the first so on by poll method and later it removes the element by remove method
	}

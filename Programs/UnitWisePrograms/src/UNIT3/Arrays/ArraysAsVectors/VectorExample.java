import java.util.*;  
public class VectorExample {  
       public static void main(String args[]) {  
        //Create an empty Vector        
        Vector<Integer> v = new Vector<>();
		
        //Add elements in the vector  
        v.add(100);  //add the element at the end
        v.add(200);  
        v.add(300);  
        v.add(400);  
        v.addElement(500);  
        v.add(600);  
        v.add(700);  
		v.add(0,50); 
		
		
        System.out.println("Size of the vector:"+v.size());
		System.out.println("Capacity of the vector:"+v.capacity());
        System.out.println("Values in vector: " +v);  
         System.out.println("First Element of the vector: " +v.firstElement());
		System.out.println("Last Element of the vector: " +v.lastElement());
	  
        System.out.println("Removes Second location value: "+v.remove(2));
		System.out.println("Use of get():"+v.get(1));
 		System.out.println("Values in vector: " +v);  //Display the vector elements afre remove() method  
 		
		Enumeration<Integer> e  = v.elements();  
        System.out.println("Data in enumeration object is: ");  
        while (e.hasMoreElements())   
        {             
            System.out.print ( e.nextElement()+"  ");  
        }  
		 v.clear();
		 System.out.println(" \nAfter Clearing -Values in vector: " +v);  //Display the vector elements afre remove() method  
		  
        }  
}  
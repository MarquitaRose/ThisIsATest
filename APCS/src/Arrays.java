import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class Arrays {

	public static void main(String args[]){
		//callArray();
		//collections();
		arrayListes();
	}
	
	public static void callArray(){
		/////instred of going through the for loop, this can be done to go through the array\\\\\\
		int list[] = {11,22,33,44,55,66,77,88,99};
		for (int item: list)
			System.out.print(item + " ");
			System.out.println("\n\n");
	}
	
	
	public static void collections(){
		
		/////Cannot instantiate object with interface; it is abstract\\\\\
		/*Collection collect = new Collection(); 
		System.out.println("Collection contains: " + collect);*/
		
		
		                          /////Collection Interface  \\\\\
		/////          List interface                           Set  interface       \\\\\
		/////ArrayList class   LinkedList class         HashSet class    TreeSet class
		
	///// Set and List cannot be instantiated on their own, however, they can be written like this\\\\\
		

		ArrayList object1  = new ArrayList();
		LinkedList object2 = new LinkedList();
		HashSet object3    = new HashSet(); 
		TreeSet object4    = new TreeSet();

		System.out.println("Simply stated (no collection interface name");
		System.out.println("object1 contains  " + object1); 
		System.out.println("object2 contains  " + object2); 
		System.out.println("object3 contains  " + object3); 
		System.out.println("object4 contains  " + object4); 
		System.out.println();
		
		
		/////"The only difference is that on the left side of the declaration\\\\\
        /////statement you will see the Collection interface name and not the name of each \\\\\
          ////class that is being instantiated"\\\\
		
		Collection oobject1 = new ArrayList(); 
		Collection oobject2 = new LinkedList(); 
		Collection oobject3 = new HashSet(); 
		Collection oobject4 = new TreeSet();

		
		Random number = new Random(100);
		for (int x = 0; x <=10; x++){
			int ohNo = number.nextInt(10)+10;
			/////List can store duplicate elements\\\\\
			oobject1.add(ohNo);
			oobject2.add("SPAM");
			/////Set cannot store duplicate elements\\\\\
			oobject3.add(ohNo);
			oobject4.add("SPAM");
			
			 
		}
		
		System.out.println("Colection Interface Name");
		System.out.println("object1 contains  " + oobject1); 
		System.out.println("object2 contains  " + oobject2); 
		System.out.println("object3 contains  " + oobject3); 
		System.out.println("object4 contains  " + oobject4); 
		System.out.println();
	}
	
	public static void arrayListes(){
		/////ArrayList allows for dynamic resising and contains a set of methods to manipulate data\\\\\
		
		/////Add method creates space for a new addition to the ArrayList and\\\\\
		/////adds on the addition to the end of the array\\\\\
		ArrayList bob = new ArrayList();
		bob.add("for apples");
		bob.add("for eyeballs");
		bob.add("for Bobs");
		bob.add("for humans!");
		
		System.out.println("You can bob " +bob);
		/////The size method takes the number of elements in the array. LENGTH DOES NOT WORK!\\\\\
		System.out.println("Er ma gerd! That's " + bob.size() + " ways to bob!");
		
		System.out.println("Tell me class, what is the third thing you can bob for?");
		System.out.println("CLASS: " + bob.get(3-1));
		
		System.out.println("Correct! We're going to add one more: bob for threes.");
		/////set (index, object) THis only puts the object in this index; the 
		/////elements do not have an index location yet\\\\\
		bob.set(2, "for plasic fishes");
		
		System.out.println("You can bob " + bob);
		
		System.out.println("Wait a sec. That doesn't look right.");
		//////the remove method removes an object at the stated index location and decreases the array size\\\\
		bob.remove(3);
		
		System.out.println("Okay, once again, you can bob " +bob);
	}
}

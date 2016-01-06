
    /////An algorithim is a step-by-step problem to a solution.\\\\\
                    /////Data Structures + Algorithms = Programs (Nikclaus Wirth)\\\\\

import java.util.Random;
import java.util.Scanner;

    public class QAlgorithimsOne{

    public static void main(String args[]) 
    {
        Scanner putin = new Scanner(System.in);
        System.out.println("Enter the desired size of your list.");
        int size = putin.nextInt();
        System.out.println("What is the lowest number?");
        int low = putin.nextInt();
        System.out.println("What is the highest number?");
        int high = putin.nextInt();
        
        List4 array = new List4(size, low, high);
        array.display();
        array.pause();
        System.out.println();
        
        System.out.println("Enter the number you are searching for.");
        int search = putin.nextInt();
        
        int index = array.linearSearch(search);
        if(index == -1)
        	System.out.println(search + " is not in the list.");
        else
        	System.out.println(search + " is found at index " + index);

    }

  }


    class List4

    { 

        private int intArray[]; // stores array elements 
        private int size;  // number of elements in the array 
        private int minInt;  // smallest random integer 
        private int maxInt;  // largest random integer


/*    public List4(int s) 

    { 

    System.out.println("\nCONSTRUCTING NEW LIST OBJECT WITH DEFAULT VALUES"); 
    size = s; 
    intArray = new int[size]; 

    } 
*/

/*    public List4(int s, int n) 
    { 
    System.out.println("\nCONSTRUCTING NEW LIST OBJECT WITH SPECIFIED VALUES"); 
    size = s; 
    intArray = new int[size]; 
    for (int k = 0; k < size; k++) 
    intArray[k] = n; 
    } 
*/


    public List4(int s, int min, int max) 
    { 
    Random rndInt = new Random(12345);   
    minInt = min; 
    maxInt = max; 
    size = s; 
    
    System.out.println("\nCONSTRUCTING LIST WITH VALUES in [" + minInt + ".." + maxInt + "] range"); 
    intArray = new int[size]; 
    int range = maxInt - minInt + 1; 
    for (int k = 0; k < size; k++) 
    intArray[k] = rndInt.nextInt(range) + minInt; 
    }

    
   
    
    
    public void assign() 
    { 

    System.out.println("\nASSIGNING RANDOM VALUES TO LIST OBJECT"); 
    Random rndInt = new Random(12345);
    for (int k = 0; k < size; k++) 
    intArray[k] = rndInt.nextInt(1000); 
    }




    public void display() 
    { 
        System.out.println("\nDISPLAYING ARRAY ELEMENTS");
        for (int k = 0; k < size; k++) 
        System.out.print(intArray[k] + "  ");
        System.out.println();
    } 


    

    public void pause() 
    {   
    Scanner input = new Scanner(System.in);  
    String dummy; 

    System.out.print("\nPress <Enter> to continue  ===>>  "); 
    dummy = input.nextLine(); 
   }

      
    public int linearSearch(int sn){
    	boolean found = false;
    	int k = 0;
    	while(k<size &&!found)
    	{
    		if (intArray[k]==sn)
    			found = true;
    		else k++;
    	}
    	
    	if (found)
    		return k;
    	else
    	return -1;
    }
    
}



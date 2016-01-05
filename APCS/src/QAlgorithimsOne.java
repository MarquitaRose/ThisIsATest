


        /////An algorithim is a step-by-step problem to a solution.\\\\\

                    /////Data Structures + Algorithms = Programs (Nikclaus Wirth)\\\\\


    import java.util.Random;


    


    public class QAlgorithimsOne{


    


    public static void main(String args[]) 

    {

    List1 array1 = new List1(10); 

    array1.display();

    List1 array2 = new List1(10,999); 

    array2.display();

    array2.assign();

    array2.display();

    System.out.println();

    }

    }


    class List1

    { 

    private int intArray[]; // stores array elements

    private int size; // number of elements in the array

       


    public List1(int s) 

    { 

    System.out.println("\nCONSTRUCTING NEW LIST OBJECT WITH DEFAULT VALUES"); 

    size = s; 

    intArray = new int[size]; 

    } 


    public List1(int s, int n) 

    { 

    System.out.println("\nCONSTRUCTING NEW LIST OBJECT WITH SPECIFIED VALUES"); 

    size = s; 

    intArray = new int[size]; 

    for (int k = 0; k < size; k++) 


    intArray[k] = n; 

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


      

}



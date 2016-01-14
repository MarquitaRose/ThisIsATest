
////////NOTE: Recursion is an important topic with frequent questions on both the APCS Examination.
////////The APCS Examination requires that a student can understand and evaluate recursive methods.  
////////The APCS Examination does not require that students generate free response recursive solutions.


/////Recursion is the computer programming process of a method calling itself.
/////All recursion methods must have a stop condition, a base case.

//import java.awt.Graphics;

public class URecursion {
	public static void main(String args[]){
		System.out.println("\n\nCALLING PRE-RECURSIVE COUNT METHOD"); 

		count2(100,105); 

		System.out.println("\n\nEXECUTION TERMINATED");
	}
	
	 
 public static void count2(int a, int b){
	 
	///// The stack controls recursion, since it controls the execution sequence of methods, and stores local 
	 ///// method information. Every method call requires the completion of the called
	 /////method, even if the execution sequence is interrupted, by another recursive method call.
	 ///// Incomplete recursive calls result in a last-in-first-out execution sequence.. See below.

	 
		if (a <= b)
		{ 
		System.out.println("Interrupting method completion: pushing " + a + " on stack.");
		count2(a+1,b);
		System.out.println("Returning to complete method; popping " + a + " from stack."); 
		System.out.println("Displaying popped value " + a);       

		}

		}
	
	/*public static void paint(Graphics grid){
		
	}*/
}

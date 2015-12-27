/////Reserved words are part of the Java language the same way that table, walk and \\\\\
          ////mother are part of the English language.\\\\\

/////A user-defined variable is a word used in a program is selected by the programmer.\\\\\
          /////Predefined variables are methods that have predefined functions\\\\\

/////a = 10...  Such a statement should be read as a becomes 10 or 10 is assigned to a,\\\\\
                           /////but not a equals 10.\\\\\


////byte 1 -128 . . . 127 \\\\\

/////short 2 -32,768 . . . 32,767\\\\\ 

/////int 4 -2,147,483,648 . . . 2,147,483,647 \\\\

/////long 8 -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807\\\\\


public class DataTypes {
	public static void main (String args[]){
	int one;
	one =1;
	byte two = 2;
	short what = 44;
	
	////byte addition = one + two; will not work. You must make it an int or have it as displayed below\\\\\
	////^^same with short \\\\\
	//byte addition = (byte) (one + two);
	////as shown above, the initial variable can be declared in byte or short. However, defining it with 
	          ////other predefined variables does not work\\\\
	
	int addition = one + two;
	int subtraction = one - two;
	/////long multiplication = one * two; works, but in this example will take up too much memory\\\\
	int multiplication = one * two;
	int division = two / one;
	int remainder = addition % two;
	
	System.out.println("1 + 2 = " + addition);
	System.out.println("1 - 2 = " + subtraction);
	System.out.println("1 x 2 = " + multiplication);
	System.out.println("2 / 1 = " + division);
	System.out.println("3 / 2 has a remainder of " + remainder);
	
	/////It works the same with doubles too! Doubles are numbers with decimal points \\\\
	                /////(think "double the precision")\\\\\ 
	
	double no = 3;
	System.out.println("\n no = " +no);
	
	double pi = 3.1415926535897932384626433832795;
	System.out.println("Pi = " + pi);
	
	double ten = 10.0;
	double three = 3.0;
	System.out.println(ten/three);
//// Realize that there are limitations when it comes to the how much the computer stores and computes.\\\\\
	
/////Beware for memory overflow problems! While it is important to save memory as much as possible,\\\\
	////being stingy may result in memory overflow (where the assigned value exceeds storage space)\\\\
	                      ////which results in inaccurate values.\\\\\
	int intNum = 1000; 
	System.out.println("\nintNum: " + intNum); 

	intNum = intNum * 1000; 
	System.out.println("intNum: " + intNum); 

	intNum = intNum * 1000; 
	System.out.println("intNum: " + intNum);

	intNum = intNum * 1000; 
	System.out.println("intNum: " + intNum);
	
	
/////Java unary operators are as follows:\\\\\
	///// x++     x = x+1;
	/////x--      x = x-1;
		/////NOTE: Putting the operators (+/-) before would increase/decrease (prefix) before display if
		/////      put in an output display, and placing them after would increase/decrease 
	    /////      after displaying (postfix). Placing the shortcut in an output display is improper use.
	
	///// x+= 10; x = x+10;
	/////x -= 10  x = x-10;
	/////x*=10    x = x*10;
	/////x/=10   x = x/10;
	/////x%=10    x = x%10;
	
	int x = 10; 

	System.out.println("\nx equals " + x); 

	x += 10; 
	System.out.println("x equals " + x); 

	x -= 10;
	System.out.println("x equals " + x);

	x *= 10; 
	System.out.println("x equals " + x);

	 x /= 10; 
	System.out.println("x equals " + x);

	x %= 10; 
	System.out.println("x equals " + x);
	System.out.println();
	
	
	
////A char is used to process a single character. A String is used for one or more sets of characters.\\
	
	char ai = 'A';
	char be = 'B';
	System.out.println(ai + " " + be);
/////The following is an example of chain assignment\\\\\
	ai = be = 'G';
	System.out.println(ai + " " + be);
	
/////The plus operator ( + ) is used both for arithmetic addition and string concatenation. \\\\\
/////The same operators perform two totally different operations, called overloading.  \\\\\
	
	String hi = "Hello";
	String wald = "World";
	String together = hi+wald;
	System.out.println(together );
	}
}

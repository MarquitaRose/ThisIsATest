         //\\AP ALERT! The int, double, boolean and String data types will be tested.\\//
         //\\The byte, short, long, float and char data types will NOT be tested.\\//

/////Reserved words are part of the Java language the same way that table, walk and \\\\\
          ////mother are part of the English language.\\\\\

/////A user-defined variable is a word used in a program is selected by the programmer.\\\\\
          /////Predefined variables are methods that have predefined functions\\\\\

/////a = 10...  Such a statement should be read as a becomes 10 or 10 is assigned to a,\\\\\
                           /////but not a equals 10.\\\\\


////byte         1       -128 . . . 127 \\\\\

/////short       2       -32,768 . . . 32,767\\\\\ 

/////int         4       -2,147,483,648 . . . 2,147,483,647 \\\\

/////long        8       -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807\\\\\


public class AdataTypes {
	public static void main (String args[]){
		primitiveDataTypes();
		mathShortcuts();
		charStringBoolean();
		learnFinal();
		typeCasting();
		escapeSequences();
	}
	
	public static void primitiveDataTypes(){
/////A simple data type, also called a primitive data type, is simple because it stores a single 
	                  	/////value in memory\\\\\

/////Data types are declared so that the computer can save enough memory space to store the value\\\\\		
	int one;
	one =1;
	byte two = 2;
	short what = 44;
	
////byte addition = one + two; will not work. You must make it an int or have it as displayed below\\\\\
////^^same with short \\\\\
//byte addition = (byte) (one + two);
////as shown above, the initial variable can be declared in byte or short. However, defining it with\\\\ 
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
	
	
	            
/////There are two real-number data types: float (4 bytes) and double (8 bytes). 
	/////float is short for floating point number and double has twice the precision.\\\\\

/////The math works with doubles too (with the exception of modulus division)! \\\\	
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
	System.out.println("");
	}
	
	public static void mathShortcuts(){
	
/////Java unary operators are as follows:\\\\\
	///// x++     x = x+1;
	/////x--      x = x-1;
		/////NOTE: Putting the operators (+/-) before would increase/decrease (prefix) before display if
		/////      put in an output display, and placing them after would increase/decrease 
	    /////      after displaying (postfix). Placing the shortcut in an output display is improper use.
	
	/////x+= 10; x = x+10;
	/////x -= 10  x = x-10;
	/////x*=10    x = x*10;
	/////x/=10   x = x/10;
	/////x%=10    x = x%10;
	
	int x = 10; 

	System.out.println("x equals " + x); 

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
	
///// Remember the PEMDAS rule for order of operations? It applies to computations made on the computer too
	}
	
	public static void charStringBoolean(){
	
////A char is used to process a single character. A String is used for one or more sets of characters.\\
		/////Note: A String is not a simple data type, though at this point it is treated as one.\\\\\
	
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
	System.out.println(together);
	
	
	
	
/////The boolean data type can have two values: true or false. They are declared like the rest:\\\\\
	///// boolean yeah = true;     or boolean yeah = false;\\\\\
	
/////Declaring a constant is much like declaring a variable; however, the word final is added\\\\\
	}
	
	public static void learnFinal(){
	final int lifeUniverseAnything = 42;
	System.out.println("\nThe answer to life, the universe, and anything is " + lifeUniverseAnything);
	//lifeUniverseAnything = 27;
	//System.out.println("The answer has changed; it is now " + lifeUniverseAnything);
	}
	
	public static void typeCasting(){
                /////It's magic! Watch and learn ;)\\\\\
	int intVal    = 65; 
	double dblVal = 70.1; 
	char chrVal  = 'B';

	System.out.println("(double) intVal 65    becomes " + (double) intVal); 
	System.out.println("(char)   intVal 65      becomes " + (char) intVal);
	System.out.println("(int)    dblVal 70.1    becomes " + (int) dblVal);
	System.out.println("(char)   dblVal 70.1  becomes " + (char) dblVal);
	System.out.println("(int)    chrVal B         becomes " + (int) chrVal); 
	System.out.println("(double) chrVal B     becomes " + (double) chrVal); 
	System.out.println();
	
/////Type casting is basically manipulating the data into the type you need it in. Say you're trying to
///// find the (double) average of (int) 1, 3, and 6. The answer given would be 3.0. That's not right!
/////The reason is because the computer sees theses as ints and computes as ints. If we want it to 
/////compute as a double, we have to put (double) in front of it, like above.
	}
	
	
	public static void escapeSequences(){
/////An escape sequence is a single slash followed by some character placed between double quotes.\\\\\
		
		System.out.print("Line one; print not println");
		System.out.println("\n<--- That\\n performs a carriage return and line feed; in other words"
				+ " its like an enter key.");
		System.out.println("\t<--- That\\t performs a horizontal tab.");
		//System.out.print("<--- That \\r performs a carriage return without a line feed;"
		//		+ " the output will not be displayed.\r");
		System.out.println("\\<--- That double slashing returns a single slash.");
		System.out.println("\"<--- That returns double quotes.");
		
	}
}

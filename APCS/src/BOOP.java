/////Object Oriented Programming (OOP) is a  style of programming that incorporates the three \\\\\
/////features of encapsulation, polymorphism and inheritance. Object Oriented Programming simulates \\\\\
/////real life by using a program style that treats a program as a group of objects.\\\\\

/////Encapsulation means packaging (encapsulating) the attributes and methods of an object in the \\\\\
/////same container; think object with 'noun' and 'verb'. Things that define it as well as its \\\\\
                         /////function are stored together as one.\\\\\

/////Modules that perform a related set of functions are grouped together in a special program type \\\\\
                                  /////of container called a class.\\\\\


/////Classes contain data and attributes as well as methods. There are two types of methods: class\\\\\
                            ///// methods and object methods.\\\\\
public class BOOP {
	public static void main(String args[]){
		mathClass();
	}
	
	public static void mathClass(){
/////The math class is part of the java.lang package, which is automatically imported by the compiler\\\\

/////Consider   Math.sqrt(square);
		/////Math is the class identifier; this class will contain the method being called.
		///// The dot (.) separates the class identifier from the method identifier.
		/////sqrt is the method identifier. 
		////square is the parameter or argument that is being passed to the method in order to complete
		    /////the computation
		
/////The parameter can be passed in different formats.\\\\\
		
		double n1, n2, n3, n4; 
		
		n1 = Math.sqrt(1024); // constant argument 
		n2 = Math.sqrt(n1); // variable argument 
		n3 = Math.sqrt(n1 + n2);        // expression argument 
		n4 = Math.sqrt(Math.sqrt(256));  // method argument 

		System.out.println("n1: " + n1); 
		System.out.println("n2: " + n2); 
		System.out.println("n3: " + n3); 
		System.out.println("n4: " + n4); 

		
		System.out.println();
		int square = 225;
		System.out.println(Math.sqrt(square)); //square root of number
		System.out.println(Math.floor(5.1)+ Math.floor(5.9)); //returns the lower integer
		System.out.println(Math.ceil(5.1)+ Math.ceil(5.9)); //returns the higher integer
		System.out.println(Math.ceil(5.1)+ Math.floor(5.9));// rounds to nearest integer
	}
}

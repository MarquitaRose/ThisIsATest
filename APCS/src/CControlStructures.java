

/////Program Flow follows the exact sequence of listed program statements, unless directed otherwise\\\\ 
                                  /////by a Java control structure.\\\\\

/////Control provided by the sequence of program statements is called simple sequence.\\\\\
/////Selection/conditional branching/decision making is when it is determined whether the program will
                            /////go in a specific direction\\\\\
/////Repetition does what it sounds like it does; it repeats part of a program\\\\\

/////A conditional statement is a program expression, which evaluates to true or false. Most\\\\\ 
/////conditional statements require a relational operator. All conditions must be placed inside\\\\\
                          /////parentheses.\\\\\

import java.util.Scanner;

public class CControlStructures {
	public static void main(String args[]){
		
		
		Scanner inYouPut = new Scanner(System.in);
		String typed = inYouPut.nextLine();
		real(typed);
	}
	
	public static void scannerStuff(){
		Scanner expiriment = new Scanner(System.in);
		System.out.println("Enter your name, peasant!");
		String name  = expiriment.nextLine();
/////nextLine() takes the input as a String, even if it is a number\\\\\
		
		System.out.println("Now enter your dumb, insignificant age.");
		int age = expiriment.nextInt();
/////nextInt() takes the input as an integer. The input MUST be an integer, or the program will error you.\\\\\
		
		System.out.println("Enter how old you wanna live.");
		int dAge = expiriment.nextInt();
		
		System.out.println("What's your GPA, uneducated scum?");
		double gpa = expiriment.nextDouble();
/////nextDouble takes the input as a double. If an integer is put in, it will simply add a '.0' to make it a double.
		
		System.out.println("So, " + name + ", I hear that you are currently " + age + " and want to live until you are "
				+ dAge + " years old. You still have " + (dAge-age) + " to live, it seems. How is your GPA " + gpa + "?");
		
		
	}
	
	
	public static void ifStatements(){
		int degreesF  = 32;
		int date = 222;
		int c = 28;
		int d = 45;
		
/////There are 6 conditional relational operators: 
		///// <= less than or equal to
		///// >= greater than or equal to
		///// <  less than
		///// >  greater than
		///// ==  equal
		///// != not equal
///// The 'if' statement is basically saying that if whatever is in the parenthesis is true, run what is inside the loop.
		/////If the loop is greater than one line, brakets must be used as they are in methods.
		
		/////   if (condition true)
		/////   execute program statement
		
		if (degreesF<=32)
			System.out.println("Ice Skating!");
		
		
		if (date >31)
			System.out.println("Don't lie to me little man!");
		
		if (c!=28){
			System.out.println("Why is this here?");
			System.out.println("What is life?");
			System.out.println("Help me.");
		}
		
	}
	
	public static void real(String theInput){
		char learnWhat = theInput.charAt(0);
		
		switch(learnWhat){
		case 'A': scannerStuff(); break;
		case 'B': ifStatements(); break;
		}
	}
}

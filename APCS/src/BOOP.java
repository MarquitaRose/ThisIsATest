import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

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
public class BOOP extends Applet{
	/*public static void main(String args[]){
		mathClass();
	}*/
	
	public static void mathClass(){
/////The math class is part of the java.lang package, which is automatically imported by the compiler\\\\

/////Consider   Math.sqrt(square);
		/////Math is the class identifier; this class will contain the method being called.
		///// The dot (.) separates the class identifier from the method identifier.
		/////sqrt is the method identifier. 
		////square is the parameter or argument that is being passed to the method in order to complete
		    /////the computation
////NOTE: Be careful when putting mathematical equations straight into the print/println method. \\\\\
////If you're trying to simply put two equations in to print, it will add them together, not display both\

		
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
		System.out.println(Math.sqrt(square));                       //square root of number
		System.out.println(Math.floor(5.1)+ "\t" + Math.floor(5.9)); //returns the lower integer
		System.out.println(Math.ceil(5.1)+ "\t" + Math.ceil(5.9));   //returns the higher integer
		System.out.println(Math.ceil(5.1)+ "\t" + Math.floor(5.9));  // rounds to nearest integer
		System.out.println(Math.min(184, 23*6));                     //returns the minimum of two numbers
		System.out.println(Math.max(184, 23*6));                     //returns the maximum of two numbers
		System.out.println(Math.abs(84)+ "\t" + Math.abs(-84));      //returns the absolute value
		System.out.println(Math.pow(2,2));                           //returns first parameter raised
		                                                               // to the power of the second
		System.out.println(Math.PI);                                 //returns pi
		System.out.println(Math.E);                                  //returns e
		
/////In the case of PI and E, a method call is not being made; we are accessing the data field of the
///// class directly. These values never change and do not need parameters to compute them. Both 
///// PI and E are 'final' attributes of the math class, not methods. 
		

	}
	
	public void paint(Graphics g){
/////The setColor method sets everything drawn after the statement to that color
		
/////drawLine(int x1, int y1, int x2, int y2) Draws a line from coordinate (x1,y1) to coordinate (x2,y2)
		g.setColor(Color.blue);
		g.drawLine(10, 10, 800, 500);
		g.drawLine(800, 10, 10, 500);
/////drawRect(int x, int y, int width, int height) int x and y are the starting coordinates
		g.setColor(Color.magenta);
		g.drawRect(10, 10, 790, 490);
/////fillRect does the same as drawRect but it fills the inside of the rectangle too
		g.setColor(Color.pink);
		g.fillRect(365, 230, 80, 50);
////drawOval and fillOval work the same way as the rectangle, only a oval is drawn (the oval is inscribed
		/////in the parameters set for the rectangle
		g.setColor(Color.green);
		g.drawOval(820, 100, 50, 50);
		g.fillOval(820, 300, 100, 200);
/////draw arc basically draws an incomplete oval. The first four parameters are the same;
		////the other two name the starting degree and length of the arch. The arch will draw counter-
		/////clockwise starting from the three o clock position
		g.setColor(Color.cyan);
		g.drawArc(20, 550, 50, 50, 0, 180);
		g.fillArc(100, 550, 100, 50, 90, 270);
		g.fillArc(200, 550, 100, 50, 90, -270);
		
/////drawString(String s, int x, int y)
		g.setColor(Color.black);
		g.drawString("This is displaying a string on the page", 300, 550);
	}
}

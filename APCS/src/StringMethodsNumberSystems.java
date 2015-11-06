import java.util.Scanner;
//: MANDATORY compareTo - equals - length - substring - indexOf
//: OTHERS concat - charAt - replace - toUpperCase - toLowerCase - valueOf ? trim


public class StringMethodsNumberSystems {
	public static void main(String args[]){
	System.out.println("Mandatory or optional? \n");
	choose();	
	}
	
	public static void choose() {
		Scanner options = new Scanner(System.in);

		
		switch(options.nextLine().toLowerCase()){
		case "mandatory":
		System.out.println(" 1. compareTo \n 2. equals \n 3. length \n 4. substring \n 5. indexOf");
		{
			switch(options.nextInt()){
			case 1: allMethods.compareTo(); break;
			case 2: allMethods.equals(); break;
			case 3: allMethods.length(); break;
			case 4: allMethods.substring(); break;
			case 5: allMethods.indexOf(); break;
			default: System.out.println("You're stupid.");
				}  
		}
		break;
		case "optional": {
			switch(options.nextInt()){
			case 1: allMethods.concat(); break;
			case 2: allMethods.charAt(); break;
			case 3: allMethods.replace(); break;
			case 4: allMethods.upDown(); break;
			case 5: allMethods.valueOf(); break;
			case 6: allMethods.trim(); break;
			}
		}
		break;
		default: System.out.println("Umpa loompas shall chase you now. :)"); break;
		}
		
		
		options.close();	
	}
	}

	class allMethods{
		
		public static void compareTo(){
			System.out.println("compareTo takes two strings and inputs the difference in the number value"
					+ "of the first different character.");
			String lol = "That's funny!";
			String um = "You're weird";
			String lolz = "That's funny!";
			String ok = "That's dad!";
			
			System.out.println(lol.compareTo(um));
			System.out.println(lol.compareTo(lolz));
			System.out.println(lol.compareTo(ok));
			
		}
		
		public static void equals(){
			System.out.println("UNDER CONSTRUCTION");
			String oddball = "Lizard";
			
			if (oddball == "Lizard") System.out.println(oddball + " equals Lizard" );
			else System.out.println(oddball + " does not equal Lizard");
			
			if (oddball.equals("Lizard")) System.out.println(oddball + " equals Lizard");
			else System.out.println(oddball + " does not equal Lizard");
		}
		
		public static void length(){
			System.out.println("Not quite.");
			int vary[] = {3, 8, 5, 3, 9};
			for (int x = 0; x< vary.length; x++){
				System.out.print(vary[x] + " ");
			}
		}
		public static void trim() {
			// TODO Auto-generated method stub
			
		}

		public static void upDown() {
			// TODO Auto-generated method stub
			
		}

		public static void valueOf() {
			// TODO Auto-generated method stub
			
		}

		public static void replace() {
			// TODO Auto-generated method stub
			
		}

		public static void charAt() {
			// TODO Auto-generated method stub
			
		}

		public static void concat() {
			// TODO Auto-generated method stub
			
		}

		
		
		
		
		public static void substring(){
			String iAngry = "He always takes everything out of context!";
			System.out.println(iAngry);
			System.out.println(iAngry.substring(0, 26) + "!");
		}
		
		public static void indexOf(){
			String findMe = "Felicia, Amber, Alice, Sasha";
			System.out.println("Alice: Where is my name?");
			System.out.println("Lexi: Your name can be found on " + findMe.indexOf("Alice"));
			System.out.println("Lexi: What about me? Where am I?");
			if (findMe.indexOf("Lexi") == -1) System.out.println("Alice: Sorry, you're not on there. :(");
			else System.out.println("Alice: You're on " + findMe.indexOf("Lexi"));
		}
	}
 /*public static void main(String args[]){
	allTogetherNow();
	subStrings();
	indexTest();
	lowerUpperCase();
 }
 
 public static void allTogetherNow(){
 String oh = "oh";
 String my = "my";
 String gosh = "gosh";
 String omg = oh+my+gosh;
 omg = omg.toUpperCase();
 System.out.println("Hey, it's my birthday today!");
 System.out.println(omg);
 System.out.println("");
	 
 }
public static void subStrings(){
	String spam = "Happy Birthday!";
	int n = spam.length();
	for (int ah = 1; ah <= n ; ah++) {
		System.out.println(spam.substring(0, ah));
	}
	
	for (int ah = n; ah>=0; ah--){
		System.out.println(spam.substring(0, ah));
	}
}

public static void indexTest(){
	
}

public static void lowerUpperCase(){
	
}*/



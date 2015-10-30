import java.util.Scanner;
//: MANDATORY compareTo - equals - length - substring - indexOf
//: OTHERS concat - charAt - replace - toUpperCase - toLowerCase - valueOf ? trim


public class StringMethodsNumberSystems {
	public static void main(String args[]){
	System.out.println("");
	choose();	
	}
	
	public static void choose() {
		Scanner options = new Scanner(System.in);

		
		switch(options.nextLine().toLowerCase()){
		case "mandatory": {
			switch(options.nextInt()){
			case 1: System.out.println("Hay"); break;
			case 2: System.out.println("Neigh"); break;
			case 3: System.out.println("Sleigh"); break;
			case 4: System.out.println("Yay"); break;
				}  
		}
		break;
		case "optional": {
			switch(options.nextInt()){
			case 1: System.out.println("more"); break;
			case 2: System.out.println("Bore"); break;
			case 3: System.out.println("chore"); break;
			}
		}
		break;
		default: System.out.println("Umpa loompas shall chase you now. :)"); break;
		}
		
		
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



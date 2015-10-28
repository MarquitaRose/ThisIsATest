

public class StringMethodsNumberSystems {
 public static void main(String args[]){
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
	
}
}


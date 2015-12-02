import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileStuff {
	public static void main(String args[]) throws IOException{
		File stuffs = new File("FileStuffs.dat");
		File noStuffs = new File("Woofs.dat");
		BufferedReader reed = new BufferedReader(new FileReader(stuffs));
		
		System.out.println("Does the first file exist?");
		if (stuffs.exists()) System.out.println("Yes boss. " +stuffs.getName() + " exists.\n");
		else System.out.println("Negative. " +stuffs.getName() + " does not exist.\n");
		
		System.out.println("And the second file?");
		if (noStuffs.exists()) System.out.println("Yes boss." + noStuffs.getName() + " exists.\n");
		else System.out.println("Negative. " + noStuffs.getName() + " does not exist.\n");
		
		System.out.println("How big is Stuffs?");
		System.out.println(stuffs.length() + "\n");
		
		System.out.println("I can't find it. Can you tell me where it is found?");
		System.out.println(stuffs.getAbsolutePath() + "\n");
		
		
		System.out.println("I can read it, right?");
		if (stuffs.canRead()) System.out.println("Yes \n");
		else System.out.println("No. \n");
		
		System.out.println("Can I edit it?");
		if(stuffs.canWrite()) System.out.println("Yes. \n");
		else System.out.println("No. \n");


		System.out.println("Read it to me.");
		
		
		System.out.println("This is supid.");
		stuffs.delete();
		
		
		if(stuffs.exists()) System.out.println("File Stuffs still there.");
		else System.out.println("Stuffs cannot be found.");
		
		stuffs.createNewFile();
		System.out.println("This is a much better file.");
		
		
		BufferedWriter improvement = new BufferedWriter(new FileWriter(stuffs));
		improvement.write("I like umpa loompas");
		improvement.newLine();
		improvement.write("Ewww your feet smell!");
		
		
	}
}

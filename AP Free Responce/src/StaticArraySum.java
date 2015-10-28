import javax.swing.plaf.synth.SynthSeparatorUI;

public class StaticArraySum {
	public static void main (String args[]){
		int[] arr = {1, 3, 2, 7, 3};
		System.out.println(arraySum(arr));
	}
	
	public static int arraySum(int[] arr) {
		int answer = 0;
		for (int x = 0; x < arr.length; x++){
			 answer = answer + arr[x];
		}
		return answer;
		
	}
}

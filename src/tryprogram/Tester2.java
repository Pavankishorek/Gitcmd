package tryprogram;

public class Tester2 {
	public static void main(String[] args) {
		String s1="hi hello how are you";
		String[] s2=s1.split(" ");
		for(int i=s2.length-1;i>=0;i--){
			System.out.print(s2[i]+" ");
		}
		System.out.println();
		//String s3=s1.split(" ");
		for(int i=0;i<s2.length;i++){
			System.out.print(s2[i]);
		}
		
	}
}

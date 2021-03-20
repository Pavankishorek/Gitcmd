package practice;

public class Swapthestring {
//to rev the entire string
	public static void main(String[] args) {
		String s="welcome to tyss bangalore";
		String[] s1 = s.split(" ");
		for (int i= s1.length-1;i>=0; i--) {
			System.out.print(s1[i]+" ");
		}
		
	}
}

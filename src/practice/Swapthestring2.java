package practice;

public class Swapthestring2 {
//to swap only the first and last string
	public static void main(String[] args) {
		String s="welcome to tyss bangalore karnataka";
		String[] s1=s.split(" ");
		String temp="";
		temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		
		for (String string : s1) {
			System.out.print(string+" ");
		}
	}
	
}

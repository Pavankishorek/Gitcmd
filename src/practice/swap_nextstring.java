package practice;

public class swap_nextstring {
public static void main(String[] args) {
	String s="welcome to tyss bangalore karnataka";
	String[] s1=s.split(" ");
	for (int i = 0; i < s1.length-1; i++) {
		if (i%2==0) {
			String temp=s1[i];
			s1[i]=s1[i+1];
			s1[i+1]=temp;
		}
	}
	for (String string : s1) {
		//System.out.print(string+" ");
	}
	System.out.println();
	
	//for 4 words
	
	String str="welcome to tyss bangalore karnataka india";
	String[] s2=str.split(" ");
	for (int i = 0; i < s2.length; i++) {
		if (i%2==0) {
			String temp=s2[i];
			s2[i]=s2[i+1];
			s2[i+1]=temp;
		}
	}
	for (String string : s2) {
		//System.out.print(string+" ");
	}
	
	System.out.println();
	//generic for odd and even words
	String s3="welcome to india mandya";
	String[] s4=s3.split(" ");
	int n=s4.length;
	if(n%2!=0){
		n=n-1;
	}
	for (int i = 0; i <n; i++) {
		if (i%2==0) {
			String temp=s4[i];
			s4[i]=s4[i+1];
			s4[i+1]=temp;
		}
	}
	for (String string : s4) {
		System.out.print(string+" ");
	}
	System.out.println();
	
	
}
}

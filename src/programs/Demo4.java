package programs;

public class Demo4 {
public static void main(String[] args) {
	String s1="pavan";
	String rev="";
	for (int i =4; i>=0; i--) {
		 char ch= s1.charAt(i);
		 rev=rev+ch;
		 
	}
	System.out.println(rev);
}
}

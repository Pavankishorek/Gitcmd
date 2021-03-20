package programs;

public class Trial4 {
public static void main(String[] args) {
	String s="malayalam";
	String ch="";
	for (int i =s.length()-1;i>=0; i--) {
		char ch2 = s.charAt(i);
		ch=ch+ch2;
	}
	if (ch.equals(s)) {
		System.out.println("yes it is a palindrome");
	}else{
		System.out.println("it is not a palindrome");
	}
}
}
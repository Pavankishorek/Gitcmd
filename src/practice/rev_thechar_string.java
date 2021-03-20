package practice;

public class rev_thechar_string {
public static void main(String[] args) {
	String s="welcome to tyss";//op=emoclew ot ssyt
	String[] s1 = s.split(" ");
	
	for (int i = 0; i < s1.length; i++) {
		String s2=s1[i];
		String rev="";
		for (int j = 0; j < s2.length(); j++) {
			rev=s2.charAt(j)+rev;
		}
		System.out.print(rev+" ");
	}
	
}
}

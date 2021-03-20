package tryprogram;

import java.util.Iterator;

public class Demo5 {
public static void main(String[] args) {
	String s1="malayalam";
	String rev="";
	for (int i = 0; i <s1.length(); i++) {
		char ch = s1.charAt(i);
		rev=rev+ch;
	}
	System.out.println(rev);
	if(s1.equals(rev)){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
}
}

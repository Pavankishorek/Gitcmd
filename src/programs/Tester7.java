package programs;

import java.util.ArrayList;

public class Tester7 {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	
	l1.add(12);
	l1.add(12.5);
	l1.add('A');
	l1.add("hello");
	l1.add(1234);
	
	System.out.println(l1);
	Object str = l1.get(3);
	System.out.println(str);
	String ch="";
	String s = str.toString();
	System.out.println(s);
	for (int i =s.length()-1;i>=0; i--) {
		ch=ch+s.charAt(i);
	}
	System.out.println(ch);
	l1.add(3,ch);
	System.out.println(l1);
}
}

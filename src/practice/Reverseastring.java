package practice;

public class Reverseastring {
public static void main(String[] args) {
	String s="india";
	//first try
	for (int i =s.length()-1; i>=0; i--) {
		System.out.print(s.charAt(i));
	}
	System.out.println();
	//second try
	String rev="";
	for (int i = s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.print(rev);
	System.out.println();
	//third try
	char[] ch = s.toCharArray();
	String reve="";
	for (int i = 0; i < ch.length; i++) {
		reve=ch[i]+reve;
	}
	System.out.print(rev);
	System.out.println();
	//fourth try
	String rever="";
	for (int i =ch.length-1;i>=0 ;i--) {
		rever=rever+ch[i];
	}
	System.out.print(rever);
}
}

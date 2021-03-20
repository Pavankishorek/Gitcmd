package programming;

public class tester6 {
public static void main(String[] args) {
	String s1="javadeveloper";
	String rev= " ";
	for (int i = 12; i >=0; i--) {
		char ch=s1.charAt(i);
		rev=rev+ch;
	}
	System.out.println(rev);
}
}

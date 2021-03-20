package programming;

public class palindrome {
	static int x=0;
public static void main(String[] args) {
	int no=121;
	System.out.println(no);
	while (no!=0) {
		x=no%10;
		System.out.print(x);
		no=no/10;
	}
	if (no==x) {
		System.out.println("yes it is a palindrome");
	}else {
		System.out.println("it is not a palindrome");
	}
}
}

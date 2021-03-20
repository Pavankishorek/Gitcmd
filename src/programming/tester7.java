package programming;

public class tester7 {
public static void main(String[] args) {
	int A=0,B=1,C;
	System.out.print(A+" "+B+" ");
	for (int i = 1; i < 15; i++) {
		C=A+B;
		System.out.print(" "+C);
		A=B;
		B=C;
		
	}
}

}

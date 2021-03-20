package programming;

public class Trial3 {
public static void main(String[] args) {
	int no=6;
	int fact=1;
	for (int j =no ; j >=1; j--) {
		 int x=j*fact;
		 fact=x;
		 	}
	System.out.println(fact);
}
}

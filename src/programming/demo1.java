package programming;

public class demo1 {
public static void main(String[] args) {
	int j=1;
	for (int i = 1; i <=10; i++) {
		if (i<=5) {
		    j++;
		    System.out.print(i+"");
		}else {
			j--;
			System.out.print(""+j+"");
		}			
	}
}
}
package programming;

public class demo6 {
public static void main(String[] args) {
	ex(145);
}
static void ex(int no){
	int sum=0;
	while(no!=0){
	 int rem=no%10;
	 sum=sum+rem;
	 no=no/10;
	}
	System.out.println(sum);
}
}

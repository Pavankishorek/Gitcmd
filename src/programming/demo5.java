package programming;

public class demo5 {
	public static void main(String[] args) {
		givennumber(12);
	}
static void givennumber (int no){
	if (no%5==0 & no%3==0) {
		System.out.println("buzzbuzz");
	}else if (no%5==0) {
		System.out.println("buzzfizz");
	}else if (no%3==0) {
		System.out.println("fizzbuzz");
	}
	}
}

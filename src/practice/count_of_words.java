package practice;

public class count_of_words {
	public static void main(String[] args) {
		String s="hello world";
		String[] s1=s.split(" ");
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			count++;
		}
		System.out.println(count);
	}
	
}

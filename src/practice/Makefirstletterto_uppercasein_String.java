package practice;

public class Makefirstletterto_uppercasein_String {
	public static void main(String[] args) {
		String s="welcome to tyss";
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			String s2=s1[i].substring(0, 1).toUpperCase()+s1[i].substring(1);
			System.out.print(s2+" ");
		}
	}
}

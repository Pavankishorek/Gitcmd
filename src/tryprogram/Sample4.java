package tryprogram;

public class Sample4 {
	public static void main(String[] args) {
		String s="erohsik navap";
		String s1=s.replaceAll("\\s","");
		System.out.println(s1);
		String rev="";
		for (int i =s1.length()-1;i>=0; i--) {
			char ch=s1.charAt(i);
			rev=rev+ch;
		}
		System.out.println();
		System.out.print(rev);
	}
}

package tryprogram;

public class Sample3 {
public static void main(String[] args) {
	String s="hi hello how are you";
	String str="$12345$";
	String s1=s.replaceAll("\\s","");
	System.out.println(s1);
	String w=str.replace("$"," ");
	System.out.println(w.trim());
}
}

package tryprogram;

public class Demo1 {
	public static void main(String[] args) {

	String s1="hi heloo how are you";
	String s[]=s1.split(" ");
	
    for(int i=s.length-1;i>=0;i--)
    {
    	System.out.print(s[i]+" ");
    }
	}
}

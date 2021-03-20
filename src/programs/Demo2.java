package programs;

public class Demo2 {
public static void main(String[] args) {
	String s1="PaVAnKishOre";
	for(int i=0;i<s1.length();i++)
	{
		char ch = s1.charAt(i);
		if ((ch>=65)&&(ch<=90)) {
			
			System.out.println("Upper"+" "+ch);
		}else {
			System.out.println("Lower"+" "+ch);
		}
	}
}
}

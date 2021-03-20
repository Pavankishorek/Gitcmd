package programs;

public class Tester6 {
public static void main(String[] args) {
	String s1="hi hello how are you";
	String arr[]=s1.split(" ");
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(arr[arr.length-1-i]);
	}
}
}

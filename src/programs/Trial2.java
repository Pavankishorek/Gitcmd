package programs;

public class Trial2 {
public static void main(String[] args) {
	String[] str={"mango","apple","icecream","ooty"};
	for (int i = 0; i < str.length; i++) {
		if (str[i].startsWith("a")||str[i].startsWith("e")||str[i].startsWith("i")||str[i].startsWith("o")||str[i].startsWith("u"))
		{
			System.out.println(str[i]);
		}
	}
	
}
}

package tryprogram;

public class Strings {
public static void main(String[] args) {
	String [] str={"mango","apple","icecream","ooty"};
	for (int i = 0; i < str.length; i++) {
	if (str[i].startsWith("a")||str[i].startsWith("u")||str[i].startsWith("i")||str[i].startsWith("e")||str[i].startsWith("o")) {
		System.out.println(str[i]);
	}else{
		System.out.println(str[i]+" "+"it is not a vowel word");
	}
}
}
}

package practice;

import java.util.LinkedHashSet;

public class Duplicate_character {
public static void main(String[] args) {
	String s="Welcome to ty";
	char[] ch = s.toCharArray();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		set.add(ch[i]);
	}
	for (Character character : set) {
		int count=0;
		for (int i = 0; i < ch.length; i++) {
		if (character==ch[i]) {
			count++;
		}	
		}
		//System.out.println(character+" "+count);//occurence of charcters
		//to find duplicate
	if(count>1){
		System.out.println(character+" "+count);
	}
}
}
}

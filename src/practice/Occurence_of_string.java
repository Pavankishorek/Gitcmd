package practice;

import java.util.LinkedHashSet;

public class Occurence_of_string {
public static void main(String[] args) {
	String s="welcome to india welcome to mandya";
	String[] ch = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < ch.length; i++) {
		set.add(ch[i]);
	}
	for (String string : set) {
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (string.equals(ch[i])) {
				count++;
			}
		}
		System.out.println(string+" "+count);
	}
}
}

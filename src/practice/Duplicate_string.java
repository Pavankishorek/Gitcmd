package practice;

import java.util.LinkedHashSet;

public class Duplicate_string {
public static void main(String[] args) {
	String s="welcome to india welcome to mandya";
	String[] s1= s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < s1.length; i++) {
		set.add(s1[i]);
	}
	for (String string : set) {
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			if (string.equals(s1[i])) {
				count++;
			}
		}
		
		if (count>1) {
			System.out.println(string+" "+count);
		}
	}
}
}

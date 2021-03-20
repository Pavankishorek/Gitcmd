package practice;

import java.util.LinkedHashSet;

public class noof_duplicate_string {
public static void main(String[] args) {
	String s="welcome to india welcome to mandya";
	String[] s1=s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (int i = 0; i < s1.length; i++) {
		set.add(s1[i]);
	}
	int count1=0;
	for (String string : set) {
		int count=0;
		for (int i = 0; i < s1.length; i++) {
			if (string.equals(s1[i])) {
				count++;
			}
		}
		if (count>1) {
			count1++;
		}
		System.out.println(string+" "+count);//string and repeats
	}
	System.out.println("no of duplicate strings"+" "+count1);//duplicate count
}
}

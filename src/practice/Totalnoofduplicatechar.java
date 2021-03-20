package practice;

import java.util.LinkedHashSet;

public class Totalnoofduplicatechar {
	public static void main(String[] args) {
		String s="welcome to ty";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		//add to set
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		int count1=0;
		for (Character character : set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if (character==ch[i]) {
					count++;
				}	
			}
			//System.out.println(character+" "+count);

			if (count>1) {
				count1++;
				System.out.println(character+" "+count);
			}
		}
		System.out.println("no of duplicates"+" "+count1);
	}
}

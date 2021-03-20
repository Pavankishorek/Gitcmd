package tryprogram;

import java.util.Arrays;
import java.util.HashSet;

public class Sample2 {
public static void main(String[] args) {
	String s1="wel wel welcome bangalore to mandya to";
	String s[]=s1.split(" ");
	HashSet<String> no=new HashSet<String>();
	no.addAll(Arrays.asList(s));
	System.out.print(no);
	System.out.println();
	for (String t : no) {
		System.out.print(t+" ");
	}
}
}

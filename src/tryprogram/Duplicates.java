package tryprogram;

import java.util.ArrayList;

public class Duplicates {
public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<Integer>();
	l1.add(10);
	l1.add(50);
	l1.add(40);
	l1.add(10);
	System.out.println(l1);
	
	ArrayList<Integer> l2=new ArrayList<Integer>();
	l2.add(70);
	l2.add(50);
	l2.add(80);
	l2.add(30);
	System.out.println(l2);
	l1.removeAll(l2);
	System.out.println(l1);
}
}

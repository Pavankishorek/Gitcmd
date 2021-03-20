package programs;

import java.util.ArrayList;
import java.util.Collections;

public class Trial1 {
public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<Integer>();
	l1.add(10);
	l1.add(40);
	l1.add(30);
	l1.add(70);
	l1.add(10);
	System.out.println(l1);
	ArrayList<Integer> l2=new ArrayList<Integer>();
	
	l2.add(60);
	l2.add(10);
	l2.add(50);
	System.out.println(l2);
	l1.removeAll(l2);
	System.out.println(l1);
	
	Collections.sort(l1);
	System.out.println(l1);
}
}

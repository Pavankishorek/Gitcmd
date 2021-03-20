package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor2 {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add("pavan");
		l1.add(null);
		l1.add('k');
		System.out.println(l1);
		Iterator itr=l1.iterator();
		while(itr.hasNext()){
			Object o1 = itr.next();
			System.out.println(o1);
		}
}}

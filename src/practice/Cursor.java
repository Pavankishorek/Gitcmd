package practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class Cursor {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20.56);
		l1.add("pavan");
		l1.add(null);
		l1.add('k');
		System.out.println(l1);
		ListIterator itr=l1.listIterator();
		
			while(itr.hasNext())
			{
				 boolean o1 = itr.hasNext();
				//System.out.println(o1);
			}
			while(itr.hasPrevious()){
				 boolean o2 = itr.hasPrevious();
				//System.out.println(o2);
			}
		
	}
}

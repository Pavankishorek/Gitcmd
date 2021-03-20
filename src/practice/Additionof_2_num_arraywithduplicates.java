package practice;

import java.util.HashSet;

public class Additionof_2_num_arraywithduplicates {
public static void main(String[] args) {
	int arr[]={1,3,5,4,2,6,9,7,4,1,3};
	//remove duplicates from given array
	HashSet<Integer> set=new HashSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
	//creating new array
	int ary[]=new int[set.size()];
	//add values to new array
	int count=0;
	for (  Integer value :set) {
		ary[count]=value;
		count++;
	}
	//checking for sum of 7
	for (int i = 0; i < ary.length; i++) {
		for (int j = i+1; j < ary.length; j++) {
			if(ary[i]+ary[j]==7){
				System.out.println(ary[i]+" "+ary[j]);
			}
		}
	}
	
}
}

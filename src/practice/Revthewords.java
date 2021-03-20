package practice;

public class Revthewords {
public static void main(String[] args) {
	String s="my name is pavan";
	String[] s1=s.split(" ");
	for (int i= s1.length-1;i>=0; i--) {
		System.out.print(s1[i]+" ");
	}
	System.out.println();
	//to reverse in another way
	String rev="";
	for (int i =s1.length-1; i>=0; i--) {
		rev=rev+" "+s1[i];
	}
	System.out.println(rev.trim());
}
}

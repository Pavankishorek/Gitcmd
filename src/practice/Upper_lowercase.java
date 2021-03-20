package practice;

public class Upper_lowercase {
public static void main(String[] args) {
	String s="india";
	//String[] s1=s.split("");
	String st="";
	for (int i = 0; i <s.length(); i++) {
		String str = s.charAt(i)+"";
		if(str.equals("i")){
			
		}else{
			 st=str.toUpperCase();
		}
		System.out.print(st);
	}
	
}
}

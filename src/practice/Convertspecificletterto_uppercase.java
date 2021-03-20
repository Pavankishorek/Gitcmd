package practice;

public class Convertspecificletterto_uppercase {
	public static void main(String[] args) {
		String s="indiaindia";
		
		//using inbuilt methd
		String s1=s.replace("i","I");
		System.out.println(s1);
		
		//without inbuilt
		String m="";
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='i'){
				String s2=s.charAt(i)+"";
				m=m+s2.toUpperCase();
			}else{
				m=m+s.charAt(i);
			}
		}
		System.out.println(m);
		
		//using ascii value=not working
		String m1="";
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==73){
				String s2=s.charAt(i)+"";
				m1=m1+s2.toUpperCase();
			}else{
				m1=m1+s.charAt(i);
			}
		}
		//System.out.println(m1);
		
		//by using split and foreach
		String m2="";
		String[] s4 = s.split("");
		for (String string : s4) {
			if (string.equals("i")) {
				String capital = string.toUpperCase();
				m2=m2+capital;
			}else{
				m2=m2+string;
			}
		}
		System.out.println(m2);
	}
}

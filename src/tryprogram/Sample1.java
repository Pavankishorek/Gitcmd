package tryprogram;

public class Sample1 {
public static void main(String[] args) {
	String s="welcome wel wel welcome to banaglore";
	String res="";
	String s1[]=s.split(" ");
	for (int i = 0; i <s1.length; i++) {
		if(res.toLowerCase().contains(s1[i].toLowerCase()))
		{
			continue;
		}else{
			res=" "+s1[i]+" ";
		}
		System.out.print(res);
	}
}
}

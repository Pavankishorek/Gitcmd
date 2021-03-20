package programs;

public class Tester4 {
public static void main(String[] args) {
	int num=2016;
	if(num%4==0&&num%100!=0||num%400==0)
	{
		System.out.println(num+ " yes it is a leap year");
	}else
	{
		System.out.println("not a leap year");
	}
}
}

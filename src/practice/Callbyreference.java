package practice;

public class Callbyreference {
String name="pavan";
static void call(Callbyreference c1)
{
	System.out.println(c1.name);
}
static void write(Callbyreference c2)
{
	System.out.println(c2.name+" "+"passed");
}
public static void main(String[] args) {
	Callbyreference c=new Callbyreference();
	call(c);
	write(c);
}
}

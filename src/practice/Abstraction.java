package practice;

public class Abstraction 
{
	public static void main(String[] args) {


		online o=new online();
		o.puma();
		o.nike();

	}}
abstract class shops extends shoes{
	void puma()
	{
		System.out.println("4000 starting price");
	}
}
class online extends shops{
	void nike()
	{
		System.out.println("3000 starting price");
	}
}
abstract class shoes{
	abstract void puma();
	abstract void nike();

}
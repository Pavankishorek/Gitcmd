package practice;

public class Encapsulation {
	private static int carnum=7965;

	static int getcarnum()
	{
		return carnum;
	}
	 void setcarnum(int carnum)
	{
		this.carnum=carnum;
	}
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		System.out.println(e.getcarnum());
		e.setcarnum(3751);
		System.out.println(e.getcarnum());
	}
}

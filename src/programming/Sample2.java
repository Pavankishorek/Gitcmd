package programming;

public class Sample2 {
private int vehicle_no=2751;

public int getvehicle_no()
{
	return vehicle_no;
}
public void setvehicle_no(int vehicle_no)
{
	this.vehicle_no=vehicle_no;
}
public static void main(String[] args) {
	Sample2 s2=new Sample2();
	System.out.println(s2.getvehicle_no());
	s2.setvehicle_no(8956);
	System.out.println(s2.getvehicle_no());
}
}

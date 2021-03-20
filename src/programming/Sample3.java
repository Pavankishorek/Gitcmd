package programming;
interface ola{
	void book();
}
class micro implements ola
{
	public void book(){
		System.out.println("less price");
	}
}
class mini implements ola{
	public void book(){
		System.out.println("average price");
	}
}
class auto implements ola{
	public void book(){
		System.out.println("very less price");
	}
}
class ola_app
{
	static void ebook(ola a)
	{
		a.book();
	}
}
public class Sample3 {
public static void main(String[] args) {
	micro m1=new micro();
	mini m2=new mini();
	auto m3=new auto();
	
	ola_app.ebook(m1);
	ola_app.ebook(m2);
	ola_app.ebook(m3);
}
}

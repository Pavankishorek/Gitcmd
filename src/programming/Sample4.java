package programming;
class playstore
{
	 void install(){
	System.out.println("games");
	}
}
class games extends playstore
{
	void install()
	{
		System.out.println("all arcade games");
	}
}
class socialmedia extends playstore
{
	void install() 
	{
		System.out.println("all messeging apps");
	}
}
class mobiles
{
	static void app(playstore a)
	{
		a.install();
	}
}
public class Sample4 {
public static void main(String[] args) {
	games g1=new games();
	socialmedia s1=new socialmedia();
	
	mobiles.app(g1);
	mobiles.app(s1);
}
}

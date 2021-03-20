package practice;

public class Compiletimeexception {

	public static void main(String[] args) {
		try{
			purchase();
		}
		catch(amazonexception e){
			System.out.println(e.getmessage());
		}
	}
	static void purchase() throws amazonexception
	{
		int pamnt=3000;
		if(pamnt>4000){
			System.out.println("50% discount");
		}else{
			throw new amazonexception(("no discount"));
		}
	}
}
class amazonexception extends Exception
{
	String msg;
	amazonexception(String msg) {
		this.msg=msg;
	}
	public String getmessage(){
		return msg;
	}
}

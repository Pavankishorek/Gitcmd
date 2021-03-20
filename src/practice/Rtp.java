package practice;

public class Rtp {
	public static void main(String[] args) {
	friend f=new friend();
	teacher t= new teacher();
	finale f1=new finale();
	f1.father(f);
	f1.father(t);
	}
}
class friend extends mother{
	void call()
	{
		System.out.println("pavan");
	}
}
class teacher extends mother{
	void call()
	{
		System.out.println("kishore");
	}
}
class mother{
	void call(){
		System.out.println("name");
	}
}
class finale{
	 void father(mother m){
		m.call();
	}
}
package tryprogram;

public class prime1 {
static void primeno(int no){
	boolean flag=true;
	for(int i=2;i<no;i++){
		if(no%2==0){
			flag=false;
		}
	}if (flag==true) {
		System.out.print(no+" ");
	}
}
public static void main(String[] args) {
	for(int i=2;i<=100;i++){
		primeno(i);
	}
}
}

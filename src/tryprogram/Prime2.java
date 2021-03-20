package tryprogram;

public class Prime2 {
static void pno(int no){
	boolean flag=true;
	for(int i=2;i<no;i++){
		if(no%2==0){
			flag=false;
		}
		}
	if(flag==true){
		System.out.print(no+" ");
	}
}
public static void main(String[] args) {
	for(int i=2;i<=100;i++){
		pno(i);
	}
}
}

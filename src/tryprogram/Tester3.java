package tryprogram;

public class Tester3 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		for (int j = 1; j <=3; j++) {
			if (i>=1&&j==2&&i<=2&&j==2) {
				System.out.print(" ");
			}else if (i>=4&&j==2&&i<=5&&j==2) {
				System.out.print(" ");
			}else{
			System.out.print("*");
		}
	}
		System.out.println();
}
}
}

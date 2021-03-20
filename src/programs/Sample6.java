package programs;

public class Sample6 {
public static void main(String[] args) {
	for(int i=1; i<=6; i++)
	{
		for (int j = 1; j <=6; j++) {
			if (i==2&&j>=2&&i==2&&j<=6) {
				System.out.print(" ");
			}
			else if (i>=3&&j==2&&i<=4&&j==2) {
				System.out.print(" ");
			}else if (i>=4&&j==4&&i<=5&&j==4) {
				System.out.print(" ");
			}else if (i>=3&&j==6&&i<=6&&j==6) {
				System.out.print(" ");
			}else if (i==6&&j>=1&&i==6&&j<=6) {
				System.out.print(" ");
			}else {
				System.out.print("*");	
			}
		}
		System.out.println();
	}
}
}

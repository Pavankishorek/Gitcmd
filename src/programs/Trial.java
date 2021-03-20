package programs;

public class Trial {
public static void main(String[] args) {
	int[]ch={1,6,3,5,7,8};
	int sum=0;
	for (int i = 0; i < ch.length-1; i++) {
		for (int j = 0; j < ch.length-1; j++) {
			if (ch[j]<ch[j+1]) {
				int temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
	}
	for (int i : ch) {
		System.out.print(i);
	}
	System.out.println();
	for (int i = 0; i <=2; i++) {
		 sum=sum+ch[i];	
	}
	System.out.println(sum);
	
	System.out.println(ch[1]);
}
}

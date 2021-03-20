package programs;

public class smallelearay {
public static void main(String[] args) {
	int arr[]={85,45,65,25,35};
	for (int j = 1; j <arr.length-1; j++) {
		
	
	for (int i = 0; i <arr.length-1; i++) {
		
		if (arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
		
	}
	System.out.println(arr[0]);
}
}

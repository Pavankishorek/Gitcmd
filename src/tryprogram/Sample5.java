package tryprogram;

public class Sample5 {
public static void main(String[] args) {
	int arr[]={45,22,12,80,70,66};
	int sum=0;
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}	
		}
	}
	for (int i : arr) {
		System.out.print(i+" ");
	}
	for (int k = 0; k < 3; k++) {
		 sum=sum+arr[k];
	}
	System.out.println();
	System.out.println(sum);
}
}

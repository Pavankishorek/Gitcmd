package tryprogram;

public class Secmax {
public static void main(String[] args) {
	int[] arr={10,28,37,56,75,90};
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]<arr[j+1]){
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
	}
	System.out.println(arr[1]);
	System.out.println();
	for (int k : arr) {
		System.out.print(k+" ");
	}
	
}
}

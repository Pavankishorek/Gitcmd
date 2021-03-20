package practice;

public class Bubblesort {
public static void main(String[] args) {
	int arr[]={40,70,80,50};
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	//max value
	System.out.println(arr[0]);
	//min value
	System.out.println(arr[arr.length-1]);
	//second max value
	System.out.println(arr[1]);
	//second minimum value
	System.out.println(arr[arr.length-2]);
	//print all elements
	for (int k : arr) {
		System.out.println(k);
	}
}
}

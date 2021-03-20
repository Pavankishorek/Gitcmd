package practice;

public class Sumofarray {
public static void main(String[] args) {
	int arr[]={12,14,16};
	int arr1[]={10,11,12};
	int sum[]=new int[arr.length];
	for (int i = 0; i <arr.length; i++) {
		sum[i]=arr[i]+arr1[i];
	}
	for (int i : sum) {
		System.out.println(i);
	}
}
}

package practice;

public class Swap_int_inarray {
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int key=2;
		for (int j = 0; j<key; j++) {

			for (int i = 0; i < arr.length-1; i++) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
			for (int k : arr) {
				System.out.print(k+" ");
			}
		
	}
}

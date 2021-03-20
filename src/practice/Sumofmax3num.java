package practice;

public class Sumofmax3num {

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
		System.out.println("sorted");
		for (int i : arr) {
			
			System.out.println(i);
		}
		int sum=0;
		for(int i=0;i<3;i++){
			sum=sum+arr[i];
		}
		System.out.println("sum of max 3 number is" + sum);
	}
}

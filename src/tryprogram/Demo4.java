package tryprogram;

public class Demo4 {
public static void main(String[] args) {
	int arr[]={10,60,75,55,89,25};
	int sum=0;
	for(int i=0;i<arr.length-1;i++){
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]<arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for (int num: arr) {
		System.out.print(num+" ");
	}
	System.out.println();
	for(int i=0;i<=2;i++){
		
	 sum=sum+arr[i];
	}
	System.out.println(sum);
}
}

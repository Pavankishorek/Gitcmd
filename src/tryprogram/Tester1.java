package tryprogram;

public class Tester1 {
public static void main(String[] args) {
	int[] arr={1,4,8,5};
	for (int i = 0; i < arr.length; i++) {
		arr[i]=arr[i]*arr[i];
	}
	for (int j : arr) {
		System.out.print(j+" ");
	}
}
}

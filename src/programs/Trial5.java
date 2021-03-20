package programs;

public class Trial5 {
public static void main(String[] args) {
	String []arr={"happy","test","zappy","automation","apply"};
	for (int i = 0; i < arr.length-1; i++) {
		if (arr[i].endsWith("appy")) {
			System.out.println(arr[i]);
		}
	}
}
}

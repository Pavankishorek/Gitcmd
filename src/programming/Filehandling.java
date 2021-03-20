package programming;

import java.io.File;

public class Filehandling {
public static void main(String[] args) {
	File f1=new File("C:\\Users\\pavan\\Desktop\\java programs\\New folder");
	if (f1.mkdirs()) {
		System.out.println("file created");
	}else {
		System.out.println("not created");
	}
}
}

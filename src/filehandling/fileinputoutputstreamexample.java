package filehandling;

import java.io.FileOutputStream;

public class fileinputoutputstreamexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream out = new FileOutputStream("D:\\IOfiles\\fileOutput.txt");
	String s="pecock";
	out.write(97);;
	out.close();
	System.out.println("file created");
}catch(Exception e) {
	System.out.println(e);
	
	
}
	}

}

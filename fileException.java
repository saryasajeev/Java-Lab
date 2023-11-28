package PACK1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileException {

	public static void main(String[] args) {
		char[]data=new char[50];
		FileReader input=null;
		FileWriter output=null;
		String value="Hello";
		FileWriter f1=null;
		try {
			f1=new FileWriter("input.txt");
			f1.write(value);
			f1.flush();
			f1.close();
			input=new FileReader("inpu.txt");
			int bytes=input.read(data);
			System.out.println(data);
			input.close();
			output=new FileWriter("output.txt");
			output.write(data,0,bytes);
			output.flush();
			output.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		}
		

	}



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler extends FileWriter {

	public FileHandler(String file) throws IOException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		System.out.println("ssssss");
		
		FileHandler file = new FileHandler("C:\\Users\\Siyan\\eclipse-workspace\\FileHandler\\src\\file.txt");
		//file.read();
		file.write("uuu");

	}
	
	public static void read() {
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Siyan\\eclipse-workspace\\FileHandler\\src\\file.txt")); 
			String line = "";
			while((line = reader.readLine())!=null) {				
				list.add(line);
				
			}
			System.out.println(list.toString());
			reader.close();
		}
		catch(IOException e){
			e.getStackTrace();
		}
	}
	
	
	public void write(String str) throws IOException {
		String cap ="";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int n = (int) c;
			if(97<=n && n<=122) {
				n=n-32;
				
			}
			cap = cap +(char)n;
			
		}
		write(cap,0,str.length());
	}
	
	

}

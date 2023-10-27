package java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResource {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
		try (fileStream) {
			String greeting = "Welcome to javaTpoint.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}


/*
This code executes fine with Java 7 and even with Java 9 because Java maintains it's legacy.

But the below program would not work with Java 7 because we can't put resource 
declared outside the try-with-resource.


  try(FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");){  
             String greeting = "Welcome to javaTpoint.";      
                byte b[] = greeting.getBytes();       
                fileStream.write(b);      
                System.out.println("File written");           
        }catch(Exception e) {  
            System.out.println(e);  
        }         



*/

package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	Scanner sc = new Scanner(System.in);
	public void createFile() throws Exception {
		System.out.println("Enter the file name you need to create:");
		String filename = sc.nextLine();
		File files = new File(filename);
		if(files.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File is already created");
		}
	}
	public void writeFile() throws Exception {
		System.out.println("Enter the file name you need to create:");
		String filename = sc.nextLine();
		FileWriter write = new FileWriter(filename);
		System.out.println("Enter the text you need to write:");
		String filewrite = sc.nextLine();
		write.write(filewrite);
		write.close();
	}
	
	public void readFileandappend() throws Exception {
		System.out.println("Enter the file name you need to read:");
		String read = sc.nextLine();
		FileReader reader = new FileReader(read);
		String previous =reader.readAllAsString();
		System.out.println(previous);
		reader.close();
		FileWriter written= new FileWriter(read);
		System.out.println("Enter the file name you need to write:");
		String writes = sc.nextLine();
		written.write(previous+" "+writes);
		written.close();
	}

	public static void main(String[] args) throws Exception {
		FileHandling F = new FileHandling();
		F.createFile();
		F.writeFile();
		F.readFileandappend();
	}

}

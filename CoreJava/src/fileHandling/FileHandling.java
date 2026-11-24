package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	public void Filecreate() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you need to create:");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		
		if(file.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File is already created");
		}
	}
	
	public void Filewrite() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you need to create:");
		String fileNames= sc.nextLine();
		FileWriter files = new FileWriter(fileNames);
		System.out.println("Enter the text you need to write:");
		String filewrite = sc.nextLine();
		files.write(filewrite);
		files.close();
		System.out.println("Thank you");
	}
	
	public void Fileread() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you need to Read:");
		String fileRead= sc.nextLine();
		FileReader read = new FileReader(fileRead);
		System.out.println(read.readAllAsString());
		read.close();
	}
	
	public void Filedelete() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you need to delete:");
		String filedelete= sc.nextLine();
		File file= new File(filedelete);
		 if(file.delete()) {
			 System.out.println("File is deleted");
		 }else {
			 System.out.println("File not found");
		 }
	}
	
	public void appendnewdatatopreviousdata() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you need to Read:");
		String fileRead= sc.nextLine();
		FileReader filename = new FileReader(fileRead);
		System.out.println(filename.readAllAsString());
		filename.close();
		FileWriter files = new FileWriter(fileRead);
		System.out.println("Enter the text you need to write:");
		String filewrite = sc.nextLine();
		files.write(filewrite);
		files.close();
		System.out.println(filename+""+files);
		
	}
	public static void main(String[] args) throws IOException{
		FileHandling F =new FileHandling();
		
		int choice = 0;
		do {
		System.out.println("-----File Handling-----");
		System.out.println("Enter 1 to create file: ");
		System.out.println("Enter 2 to write file: ");
		System.out.println("Enter 3 to read file: ");
		System.out.println("Enter 4 to delete file: ");
		System.out.println("Enter 5 to append the new data: ");
		System.out.println("Enter 0 to exit: ");
		System.out.println("Enter your option:");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			F.Filecreate();
			break;
		case 2:
			F.Filewrite();
			break;
		case 3:
			F.Fileread();
			break;
		case 4:
			F.Filedelete();
			break;
		case 5:
			F.appendnewdatatopreviousdata();
			break;
		case 0:
			System.out.println("Loop Exit");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		}while(choice!=0);
			
	}

}

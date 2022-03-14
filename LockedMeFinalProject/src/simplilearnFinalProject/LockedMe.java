package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {

	static final String projectFilesPath="D:\\feb12batch\\javafinalproject\\LockedMeFinalProject";
	/**
	 * This method will display menu for end users.
	 */
   public static void displayMenu()
   {
	 
	System.out.println("*******************");  
	   System.out.println("\tWelcome to locked me.com secure app");
	   System.out.println("\tdeveloped by: Raisy Raphi");
	   System.out.println("*******************");
	   System.out.println("\t1.Display all files");
	   System.out.println("\t2.Add a new file");
	   System.out.println("\t3.Delete a file");
	   System.out.println("\t4.Search a file");
	   System.out.println("\t5.Exit");
	   System.out.println("*******************"); 
	   
	   
   }
	/**
	 * This method will retrieve all the files
	 */
	public static void getAllFiles() {
		
   File folder = new File(projectFilesPath);
   File[] listOfFiles = folder.listFiles();
 	if(listOfFiles.length>0)
 	{
 		System.out.println("files listed below\n");
     for(var l:listOfFiles)
 		{   
 			System.out.println(l.getName());
 			
 		}
 	}
 	else
 		System.out.println("The folder is empty");
	}
	
	/**
	 * This method is to create new file
	 */
	 public static void createFiles()
	 {
		 try
		 {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName;
		fileName=obj.nextLine();
		
		int linescount;
		System.out.println("enter how many lines in the file:");
		linescount=Integer.parseInt(obj.nextLine());
		
		FileWriter fw= new FileWriter(projectFilesPath+"\\"+fileName);
		 
		 for(int i=1;i<=linescount;i++)
		 {
		 System.out.println("enter file line");
		 fw.write(obj.nextLine()+"\n");
		 
		 }
		 
		 System.out.println("File created successfully");
		 fw.close();
		 }
		 catch (Exception Ex)
		 {
		 }
		 
	}
	 
	 /**
	  * This method is to delete required files
	  */
	 public static void deleteFiles()
	 {
		try
		{
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Enter file name to be deleted");
		 String fileName;
		 fileName=obj.nextLine(); 
		 
		 File f = new File(projectFilesPath+"\\"+fileName);
		 if(f.exists())
		 {
		   f.delete();
		   System.out.println("File deleted successfully");
		 }
		 else
		  { 
			 System.out.println("File does not exist");
		   }
		 
		}
		catch(Exception Ex)
		{
			System.out.println("Unable to delete file. Please contact admin.");
		}
		 
	}
	 
	 
	 /**
	  * This method is to search whether given file exist in the folder or not.
	  */
	 
	 public static void searchFiles()
	 {
		try
		{
			Scanner obj=new Scanner(System.in);
			String fileName;
			System.out.println("Enter the file name to be searched");
			fileName=obj.nextLine();
			
			ArrayList<String> allFilesNames = new ArrayList<String>();
			File folder = new File(projectFilesPath);
			File[] listOfFiles =folder.listFiles();
			if(listOfFiles.length>0)
			{
				for(var l:listOfFiles)
				{
				allFilesNames.add(l.getName());
				}
			}
		
		File f = new File(projectFilesPath+"\\"+fileName);
		if(allFilesNames.contains(fileName))
		{
			System.out.println("File is available");
		}
		else
		{
			System.out.println("file is not available");
		}
	} 
		 catch(Exception Ex)
		{
		}
	}
	 
	 
	 
}

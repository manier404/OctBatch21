package org.files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Operation {

	public static void main(String[] args) throws IOException {
		// how to create a folder in specific location
		File f = new File("c:\\users\\dell\\desktop\\fileops");
		boolean mkdir = f.mkdir();
		System.out.println("Folder Successfully created ? : " + mkdir);

		// how to create multiple folders in specific location
		File f1 = new File("c:\\users\\dell\\desktop\\fileops\\proj\\java");
		boolean mkdirs = f1.mkdirs();
		System.out.println("Multiple Folder Successfully created ? : " + mkdirs);

		// how to create a file in specific folder
		File f2 = new File("c:\\users\\dell\\desktop\\fileops\\proj\\java\\fileops.txt");
		boolean createNewFile = f2.createNewFile();
		System.out.println("Folder Successfully created ? : " + createNewFile);

		// how to write inside a file in specific folder
		File f3 = new File("c:\\users\\dell\\desktop\\fileops\\proj\\java\\fileops.txt");
		FileUtils.write(f3, "Welcome to file ops");
		
		// how to add/update inside a file in specific folder
		File f4 = new File("c:\\users\\dell\\desktop\\fileops\\proj\\java\\fileops.txt");
		FileUtils.write(f4, "welcome to selenium", true);
		
		// to find the list of path available
		File li = new File("c:\\users");
		File[] lFile= li.listFiles();
		for (File X : lFile) {
			System.out.println(X);
		}
		// copy paste in another file
		File source = new File("c:\\users\\dell\\desktop\\fileops\\proj\\java\\fileops.txt");
		File Desti = new File("c:\\users\\dell\\desktop\\fileops\\proj\\java\\fileops1.txt");
		FileUtils.copyFile(source, Desti);
		
		//chk the file status
		File sour = new File("c:\\users\\dell\\desktop\\fileops\\proj\\java\\fileops.txt");
		boolean file = sour.isFile();
		System.out.println("File ? :"+file);
		
		boolean directory = sour.isDirectory();
		System.out.println("Directory ? :"+directory);
		
		boolean hidden = sour.isHidden();
		System.out.println("file is hidden ? :"+hidden);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

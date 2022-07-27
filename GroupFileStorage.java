package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GroupFileStorage {
	public void saveGroupToCSV(Group gr) {
		gr.sortStudentsByLastName();
		CSVStringConverter csv = new CSVStringConverter();
		File file1 = getGroupFileName(gr);
		try {
			PrintWriter pr = new PrintWriter(file1);
			for(int i=0; i <=gr.getStudents().length; i++) {
				if(gr.getStudents()[i]==null) return;
				pr.println(csv.toStringRepresentation(gr.getStudents()[i]));
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Group loadGroupFromCSV(File file) {
	Group gr = new Group();
		gr.setGroupName(file.getName().substring(0, file.getName().indexOf(".")));
		Student[] arr = new Student [10];
		CSVStringConverter csv = new CSVStringConverter();
		try {
			Scanner sc = new Scanner(file);
			for (int i = 0; sc.hasNextLine(); i++) {
				if(i == arr.length);
				Student student = csv.fromStringRepresentation(sc.nextLine());
				arr[i]= student;
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gr.setStudens(arr.clone());
		return gr;
	}

	public File findFileByGroupName(String groupName, File workFolder) throws FileNotFoudException {
		File[]files = workFolder.listFiles();
		if(files == null) {
			for(File file : files ) {
				if(file.isFile() && file.getName().equals(groupName + ".group")) return file;
			}
		}
	throw new FileNotFoudException("file '"+ groupName+ ".group' not found");
	}

	
	
	private File getGroupFileName(Group gr) {
		String path = "H:\\Jawa start 080622\\Java OOP home work 3\\"+gr.getGroupName()+".group";
		return new File(path);
	}
	@Override
	public String toString() {
		return "GroupFileStorage{has not field}";
	}
	
}


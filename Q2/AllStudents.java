package day10.Q2;

import java.util.Scanner;

public class AllStudents {

	   public static void main(String[] args) {
		   Scanner inputScanner=new Scanner(System.in);
		   System.out.println("Enter details of Science Student");
		   System.out.println("Enter Name");
			String nameString=inputScanner.next();
			
			inputScanner.nextLine();
			System.out.println("Enter Address");
			String addressString=inputScanner.nextLine();
			
			System.out.println("Enter marks of Science Student");
			System.out.println("Enter marks of Chemistry");
			int chemistryMarks=inputScanner.nextInt();
			
			System.out.println("Enter marks of Physics");
			int physicsMarks=inputScanner.nextInt();
			
			System.out.println("Enter marks of Maths");
			int mathsMarks=inputScanner.nextInt();
			
			Student student=new ScienceStudent(nameString,addressString );
			ScienceStudent scienceStudent=(ScienceStudent) student;
			scienceStudent.setChemistryMarks(chemistryMarks);
			scienceStudent.setPhysicsMarks(physicsMarks);
			scienceStudent.setMathsMarks(mathsMarks);
			int percentage=scienceStudent.getPercentage(physicsMarks, chemistryMarks, mathsMarks);
			System.out.println("========================================");
			System.out.println("Name :"+scienceStudent.getNameString());
			System.out.println("Address :"+scienceStudent.getAddress());
			System.out.println("Marks :");
			System.out.println("Chemistry Marks :"+scienceStudent.getChemistryMarks());
			System.out.println("Physics Marks :"+ scienceStudent.getPhysicsMarks());
			System.out.println("Maths Marks :"+ scienceStudent.getMathsMarks());
			System.out.println("Percentage of "+scienceStudent.getNameString()+" is "+percentage);
			System.out.println("========================================");

			
			System.out.println("Enter details of History Student");
			   System.out.println("Enter Name");
				String name2String=inputScanner.next();
				
				inputScanner.nextLine();
				System.out.println("Enter Address");
				String address2String=inputScanner.nextLine();
				
				System.out.println("Enter marks of History Student");
				System.out.println("Enter marks of History");
				int historyMarks=inputScanner.nextInt();
				
				System.out.println("Enter marks of Civics");
				int civicsMarks=inputScanner.nextInt();
				
				
				Student student2=new HistoryStudent(name2String, address2String) ;
					
					
				
				HistoryStudent historyStudent=(HistoryStudent) student2;
				historyStudent.setCivicsMarks(civicsMarks);
				historyStudent.setHistoryMarks(historyMarks);
			
				int percentage2=historyStudent.getPercentage(historyMarks, civicsMarks);
				System.out.println("========================================");
				System.out.println("Name :"+historyStudent.getNameString());
				System.out.println("Address :"+historyStudent.getAddress());
				System.out.println("Marks :");
				System.out.println("History marks "+historyStudent.getHistoryMarks());
				System.out.println("Civics marks "+historyStudent.getCivicsMarks());
				System.out.println("Percentage of "+historyStudent.getNameString()+" is "+percentage);
				System.out.println("========================================");
			
		
	}
}

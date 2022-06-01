package day10.Q2;

public class ScienceStudent extends Student{
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public ScienceStudent(String nameString, String address) {
		super(nameString, address);
		// TODO Auto-generated constructor stub
	}
	
	

	public int getPhysicsMarks() {
		return physicsMarks;
	}



	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}



	public int getChemistryMarks() {
		return chemistryMarks;
	}



	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}



	public int getMathsMarks() {
		return mathsMarks;
	}



	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}



	@Override
	public void getPercentage() {
		// TODO Auto-generated method stub
		
	}
	

	public int getPercentage(int physicsMarks, int chemistryMarks, int mathsMarks) {
	
		    if(physicsMarks >=0 && physicsMarks<=100 && chemistryMarks>=0 && chemistryMarks<=100  &&  mathsMarks >=0 && mathsMarks<=100 ) {
		  
		   int marks=physicsMarks+chemistryMarks+mathsMarks;
		   System.out.println(marks);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		    int x= marks*100;
		    System.out.println(x);
		   int percentage=x/300;
		    System.out.println(percentage);
		    return percentage;
		    }
		    return 0;
	}

}

package day10.Q2;

public abstract class Student {
	String nameString;
	String address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public abstract void getPercentage( );

	public Student(String nameString, String address) {
	
		this.nameString = nameString;
		this.address = address;
	}
	
	
	

}
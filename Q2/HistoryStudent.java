package day10.Q2;

public  class HistoryStudent extends Student {
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	public int getCivicsMarks() {
		return civicsMarks;
	}
	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}

	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String nameString, String address) {
		super(nameString, address);
		// TODO Auto-generated constructor stub
	}
    public HistoryStudent() {
	// TODO Auto-generated constructor stub
    }
    @Override
    public void getPercentage() {
    	// TODO Auto-generated method stub
    	
    }

	public int getPercentage(int historyMarks, int civicsMarks) {
	
	    if(historyMarks >=0 && historyMarks<=100 && civicsMarks>=0 && civicsMarks<=100) {
	    int marks=civicsMarks+historyMarks;
	    int percentage=(marks/200)*100;
	    return percentage;
	    }
	    return 0;
}

}

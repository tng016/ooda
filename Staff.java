package OODAssignment;

public class Staff {
	private String name;
	private char gender;
	private int employeeID;
	private String jobTitle;
	
	Staff(String n, char g, int e, String j){
		setName(n);
		setGender(g);
		setEmployeeID(e);
		setJobTitle(j);
	}

	public String toString(){
		return name+" "+gender+" "+employeeID+" "+jobTitle;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}

package classInheritance;

public class Instructor extends User{
	

	String department;
	
	public Instructor() {

	}
	
	public Instructor(int id, String courseNumber, String courseName, String firstName, String lastName, String mail,String password,String department) {
		super(id, courseNumber, courseName, firstName, lastName, mail, password);
		this.department=department;
		// TODO Auto-generated constructor stub
	}
	
	public Instructor(String department) {
		super();
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}

package classInheritance;

public class Student extends User{
	int userId;
	String studentNumber;
	String department;

	public Student() {

	}
	

	public Student(int id, int userId, String studentNumber, String firstName, String lastName, String department, String mail, String password) {
		super(id, firstName, lastName, mail, password);
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.studentNumber=studentNumber;
		this.department=department;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}

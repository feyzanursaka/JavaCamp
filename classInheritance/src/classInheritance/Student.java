package classInheritance;

public class Student extends User{
	String studentNumber;

	public Student() {

	}
	
	public Student(String studentNumber) {
		super();
		this.studentNumber = studentNumber;
	}

	public Student(int id, String studentNumber,String courseNumber, String courseName, String firstName, String lastName, String mail,
			String password) {
		super(id, courseNumber, courseName, firstName, lastName, mail, password);
		// TODO Auto-generated constructor stub
		this.studentNumber=studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}

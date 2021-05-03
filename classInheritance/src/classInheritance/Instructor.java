package classInheritance;

public class Instructor extends User{
	int userId;
	String academicTitle;
	
	public Instructor() {

	}
	
	public Instructor(int id, int userId, String firstName, String lastName, String academicTitle, String mail, String password) {
		super(id, firstName, lastName, mail, password);
		// TODO Auto-generated constructor stub
		this.userId=userId;
		this.academicTitle=academicTitle;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAcademicTitle() {
		return academicTitle;
	}

	public void setAcademicTitle(String academicTitle) {
		this.academicTitle = academicTitle;
	}
	

}

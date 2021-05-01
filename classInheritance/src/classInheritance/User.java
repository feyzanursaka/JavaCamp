package classInheritance;

public class User {
	int id;
	String courseNumber;
	String courseName;
	String firstName;
	String lastName;
	String mail;
	String password;
	
	public User(){
		
	}

	public User(int id, String courseNumber, String courseName, String firstName, String lastName, String mail, String password) {
		super();
		this.id = id;
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password=password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}

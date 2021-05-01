package classInheritance;

public class StudentManager extends UserManager{

	@Override
	public void login(User user) {
		System.out.println(user.firstName + ", ��renci giri� i�leminiz ba�ar�l�.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.firstName + ", ��renci kay�t i�leminiz ba�ar�l�.");
	}

	public void addStudentToCourse(User user) {
		
		System.out.println(user.getFirstName()+", "+user.courseName + " kursuna ba�ar�l� �ekilde kayd�n�z olu�turuldu.");
		
	}
	
}

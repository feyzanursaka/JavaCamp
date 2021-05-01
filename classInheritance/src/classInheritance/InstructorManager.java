package classInheritance;

public class InstructorManager extends UserManager{
	@Override
	public void login(User user) {
		System.out.println(user.firstName + ", e�itmen giri� i�leminiz ba�ar�l�.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.firstName + ", e�itmen kay�t i�leminiz ba�ar�l�.");
	}
}

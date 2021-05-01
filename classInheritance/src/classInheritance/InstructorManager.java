package classInheritance;

public class InstructorManager extends UserManager{
	@Override
	public void login(User user) {
		System.out.println(user.firstName + ", eðitmen giriþ iþleminiz baþarýlý.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.firstName + ", eðitmen kayýt iþleminiz baþarýlý.");
	}
}

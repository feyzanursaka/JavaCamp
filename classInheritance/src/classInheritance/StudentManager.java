package classInheritance;

public class StudentManager extends UserManager{

	@Override
	public void login(User user) {
		System.out.println(user.firstName + ", öðrenci giriþ iþleminiz baþarýlý.");
	}
	
	@Override
	public void register(User user) {
		System.out.println(user.firstName + ", öðrenci kayýt iþleminiz baþarýlý.");
	}
	public void getDepartment(Student student) {
		System.out.println("Öðrencinin bölümü : "+student.getDepartment());
	}

}

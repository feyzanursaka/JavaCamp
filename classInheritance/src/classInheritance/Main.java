package classInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student student1 =new Student(1,1,"1521221051","Feyza","Saka","Bilgisayar Mühendisliği","feyza@gmail.com","6789");
			Instructor instructor1 = new Instructor(1,1,"Engin","Demiroğ","Prof","engin@gmail.com","12345");
		
			
			
			Student[] students = {student1};
			Instructor[] instructors = {instructor1};
			
			StudentManager studentManager=new StudentManager();
			studentManager.register(student1);
			studentManager.getDepartment(student1);
			
			InstructorManager instructorManager=new InstructorManager();
			instructorManager.login(instructor1);
			instructorManager.getAcademicTitle(instructor1);
			
			

	}

}

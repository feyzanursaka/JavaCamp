package classInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student student1 =new Student(1,"111","1521221051","Java","Feyza","Saka","feyza@gmail.com","6789");
			Instructor instructor1 = new Instructor(1,"222","Java","Engin","Demiroğ","engin@gmail.com","12345","Yazılım");
		
			
			
			Student[] students = {student1};
			Instructor[] instructors = {instructor1};
			
			StudentManager studentManager=new StudentManager();
			studentManager.addStudentToCourse(student1);
			
			InstructorManager instructorManager=new InstructorManager();
			instructorManager.login(instructor1);
			
			

	}

}

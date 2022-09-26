package practicaexception;

public class Main {

	public static void main(String[] args) {
		Group group = new Group();
		group.setGroupName("Java");
		try {
			Student student = new Student("Victoriia", "Liamina", Gender.FEMALE, 1122, "Java");
			group.addStudent(student);
			
			student = new Student("Roman", "Liamin", Gender.MALE, 1133, "Java");		
			group.addStudent(student);
			
			student = new Student("Alina", "Liamina", Gender.FEMALE, 1144, "Java");		
			group.addStudent(student);
			
			System.out.println(group.toString());
			
			group.removeStudentByID(1133);
			System.out.println(group.toString());
			
			student = new Student();
			student = group.searchStudentByLastName("Liamin");
			
			group.removeStudentByID(student.getId());
			System.out.println(group.toString());
			
		}catch (GroupOverflowException e) {
			System.out.println("Gorup over flow!!!!");
		}catch (StudentNotFoundException e) {
			System.out.println("Student not found");
		}
	}

}

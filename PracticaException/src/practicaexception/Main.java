package practicaexception;

public class Main {

	public static void main(String[] args) {
		Student student = null;
		InputDataStudent inputData = new InputDataStudent();
		Group group = new Group();
		inputData.AddStudent(group);
		System.out.println(group.toString());
		
		group.removeStudentByID(1133);
		System.out.println(group.toString());
		
		try {		
			student = group.searchStudentByLastName("Liamin");
		}catch 	(StudentNotFoundException e) {
			System.out.println("Student not found");
		}
		
		group.removeStudentByID(student.getId());
		System.out.println(group.toString());
		
		group.sortStudentsByLastName();
		System.out.println(group.toString());
		

	}

}

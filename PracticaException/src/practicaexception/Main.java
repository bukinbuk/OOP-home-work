package practicaexception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student student = null;
		InputDataStudent inputData = new InputDataStudent();
		Group group = new Group();
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Count of Students ");
		int count = sc.nextInt();
		
		group.setGroupName(inputData.InputGroupName());
		for (int i = 0; i<count; i++) {
			System.out.println("Student #"+ (i+1));
			student = new Student(inputData.InputStudentName(), inputData.InputStudentLastName(), inputData.InputStudentGender(), inputData.InputIdStudent(), group.getGroupName());
			try {
				group.addStudent(student);
			} catch (GroupOverflowException e) {
				System.out.println("Gorup over flow!!!!");
				break;
			}
		}
		
		
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

package practicaexception;

import java.util.Scanner;

public class InputDataStudent {
	

	public InputDataStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public void AddStudent(Group group) {
////		Scanner sc = new Scanner(System.in);
////		System.out.println("Count of Students ");
////		int count = sc.nextInt();
////		
////		group.setGroupName(InputGroupName());
////		for (int i =0; i<count; i++) {
////			System.out.println("Student #"+ i+1));
////			Student student = new Student(InputStudentName(), InputStudentLastName(), InputStudentGender(), InputIdStudent(), group.getGroupName());
////			try {
////				group.addStudent(student);
////			} catch (GroupOverflowException e) {
////				System.out.println("Gorup over flow!!!!");
////				break;
////			}
////		}
//		
//	}
	
	public String InputGroupName() {
		Scanner sc = new Scanner(System.in);
		String groupName = null;
		while ( groupName == null || groupName == "") {
			System.out.println("Input goup name:");
			groupName = sc.nextLine();
		}
		return groupName;
	}
	public String InputStudentName() {
		Scanner sc = new Scanner(System.in);
		String name = null;
		while (name == "" || name == null) {
			System.out.println("Input student name:");
			name = sc.nextLine();
		}
		return name;
	}
	public String InputStudentLastName() {
		Scanner sc = new Scanner(System.in);
		String name = null;
		while (name == "" || name == null) {
			System.out.println("Input student Lastname:");
			name = sc.nextLine();
		}
		return name;
	}

	public Gender InputStudentGender() {
		Scanner sc = new Scanner(System.in);
		String genderString = null;
		Gender resultGender = null;
		
		boolean flagGender = false;
				
		while (genderString == null || !flagGender) {
			System.out.println("Input student Gender:");
			genderString = sc.nextLine();
			Gender[] gend = Gender.values();
			for (int i=0; i<gend.length; i++) {
				try {
					if (gend[i].valueOf(genderString) == gend[i]) {
						flagGender = true;
						resultGender =  gend[i];
							
						}
				}catch (IllegalArgumentException e) {
					System.out.println("Gender Error!");
					break;
				}
			}
			
		}
		return resultGender;
	}

	
	public int InputIdStudent() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		while (id == 0) {
			System.out.println("Input student id:");
			id = sc.nextInt();			
		}
		return id;
	}
}

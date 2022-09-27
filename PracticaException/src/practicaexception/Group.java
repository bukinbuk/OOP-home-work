package practicaexception;

import java.util.Arrays;
import java.util.Comparator;



public class Group {
	private String groupName;
	private Student[] students;
	
	public Group() {
		super();
		students = new Student[10];
	}
	
	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public Student[] getStudents() {
		return students;
	}


	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) throws GroupOverflowException{
		boolean flag = false;
		for (int i=0; i<students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				flag = true;
				break;
			}
		}
		if (!flag) {
			throw new GroupOverflowException();
		}
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (Student student:students) {
			if (student!= null) {
				if (student.getLastName().equals(lastName)) {
					System.out.println(student.getLastName()+" "+lastName);
					return student;
				}
			}
		}
		throw new StudentNotFoundException();
	}
	
	
	public boolean removeStudentByID(int id) {
		for (int i =0; i<students.length; i++) {
			if (students[i]!=null) {
				if (students[i].getId() == id) {
					students[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsFirst(new StudentNameComparator()));
		
	}
	
	@Override
	public String toString() {
		
			
		String str = "Students : " + groupName +System.lineSeparator()+ "            Name       LastName"+System.lineSeparator();
		for (int i = 0; i< students.length; i++) {
			if (students[i]!= null) {
				str += "student -- " +students[i].getId()+" "+ students[i].getName().toString()+"  "+ students[i].getLastName().toString()+" "+students[i].getGender()+ System.lineSeparator();
			}	
		}
		return str;
	}
}

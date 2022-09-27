package practicaexception;

import java.util.Comparator;

public class StudentNameComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Student firstStudent = (Student) o1;
	    Student secondStudent = (Student) o2;

	    String name1 = firstStudent.getName();
	    String name2 = secondStudent.getName();

	    if (name1.compareTo(name2) > 0) {
	      return 1;
	    }

	    if (name1.compareTo(name2) < 0) {
	      return -1;
	    }
	    return 0;
	}

}

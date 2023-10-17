import java.util.Arrays;
import java.util.Comparator;

public class tester {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "A", "KARAD", 95);
		arr[1] = new Student(2, "B", "PUNE", 54);
		arr[2] = new Student(3, "C", "PUNE", 98);
		arr[3] = new Student(4, "D", "KOP", 67);
		arr[4] = new Student(5, "E", "DHULE", 98);

		System.out.println("before sort");
		for (Student student : arr) {
			System.out.println(student);
		}
		class Studentcomparator implements Comparator<Student> {

			@Override
			public int compare(Student s1, Student s2) {
				int diff;
				diff = -(s1.getCity().compareTo(s2.getCity()));
				if (diff == 0)
					diff = -(Double.compare(s1.getMarks(), s2.getMarks()));
				if (diff == 0)
					diff = s1.getName().compareTo(s2.getName());

				// TODO Auto-generated method stub
				return diff;
			}

		}
		System.out.println("After sort");
		System.out.println();
		Studentcomparator citycomparator = new Studentcomparator();
		Arrays.sort(arr, citycomparator);
		for (Student student : arr) {
			System.out.println(student.toString());
		}
	}

}

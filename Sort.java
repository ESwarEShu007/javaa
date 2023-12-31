package basicprograms;
import java.util.*;
public class Sort{
	    private int id;
	    private String name;
	    private double cgpa;

	    public Student(int id, String name, double cgpa) {
	        this.id = id;
	        this.name = name;
	        this.cgpa = cgpa;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getCgpa() {
	        return cgpa;
	    }
	}

	public class Solution {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        List<Student> students = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int id = scanner.nextInt();
	            String name = scanner.next();
	            double cgpa = scanner.nextDouble();
	            students.add(new Student(id, name, cgpa));
	        }

	        Collections.sort(students, new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                if (s1.getCgpa() != s2.getCgpa()) {
	                    return Double.compare(s2.getCgpa(), s1.getCgpa()); // Sort by CGPA in descending order
	                } else if (!s1.getName().equals(s2.getName())) {
	                    return s1.getName().compareTo(s2.getName()); // Sort by name in ascending order
	                } else {
	                    return Integer.compare(s1.getId(), s2.getId()); // Sort by ID in ascending order
	                }
	            }
	        });

	        for (Student student : students) {
	            System.out.println(student.getName());
	        }
	    }
	}



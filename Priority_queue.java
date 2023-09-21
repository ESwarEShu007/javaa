package basicprograms;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Comparator;
	import java.util.Collections; // Added import for Collections





	class Student implements Comparable<Student> {
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

	    public double getCGPA() {
	        return cgpa;
	    }

	    @Override
	    public int compareTo(Student other) {
	        if (this.cgpa != other.cgpa) {
	            return Double.compare(other.cgpa, this.cgpa); // Higher CGPA first
	        } else if (!this.name.equals(other.name)) {
	            return this.name.compareTo(other.name); // Alphabetical order
	        } else {
	            return Integer.compare(this.id, other.id); // Compare by ID
	        }
	    }
	}

	class Priorities {
	    public List<Student> getStudents(List<String> events) {
	        List<Student> studentList = new ArrayList<>();

	        for (String event : events) {
	            String[] parts = event.split(" ");
	            if (parts[0].equals("ENTER")) {
	                int id = Integer.parseInt(parts[3]);
	                String name = parts[1];
	                double cgpa = Double.parseDouble(parts[2]);
	                studentList.add(new Student(id, name, cgpa));
	            } else if (parts[0].equals("SERVED") && !studentList.isEmpty()) {
	                studentList.remove(Collections.min(studentList, new Comparator<Student>() {
	                    @Override
	                    public int compare(Student s1, Student s2) {
	                        if (s1.getCGPA() != s2.getCGPA()) {
	                            return Double.compare(s2.getCGPA(), s1.getCGPA());
	                        } else if (!s1.getName().equals(s2.getName())) {
	                            return s1.getName().compareTo(s2.getName());
	                        } else {
	                            return Integer.compare(s1.getId(), s2.getId());
	                        }
	                    }
	                }));
	            }
	        }

	        // Sort the students once more before returning
	        Collections.sort(studentList);

	        return studentList;
	    }
	}



	public class Priority_queue {
	    private final static Scanner scan = new Scanner(System.in);
	    private final static Priorities priorities = new Priorities();
	    
	    public static void main(String[] args) {
	        int totalEvents = Integer.parseInt(scan.nextLine());    
	        List<String> events = new ArrayList<>();
	        
	        while (totalEvents-- != 0) {
	            String event = scan.nextLine();
	            events.add(event);
	        }
	        
	        List<Student> students = priorities.getStudents(events);
	        
	        if (students.isEmpty()) {
	            System.out.println("EMPTY");
	        } else {
	            for (Student st: students) {
	                System.out.println(st.getName());
	            }
	        }
	    }
	}


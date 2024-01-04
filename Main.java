package codesoft;
import java.util.ArrayList;
import java.util.List;

class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    // Getters and setters

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSchedule() {
        return schedule;
    }
}

class Student {
    private int studentID;
    private String name;
    private List<Course> registeredCourses;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    // Getters and setters

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    public void dropCourse(Course course) {
        registeredCourses.remove(course);
    }
}

class CourseDatabase {
    private List<Course> courses;

    public CourseDatabase() {
        this.courses = new ArrayList<>();
    }

    // Methods to add, remove, and list courses

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }
}

public class Main {
    public static void main(String[] args) {
        CourseDatabase courseDatabase = new CourseDatabase();

        // Add some courses to the database
        Course course1 = new Course("C001", "Java Programming", "Introduction to Java", 30, "Monday, Wednesday");
        Course course2 = new Course("C002", "Database Management", "Database fundamentals", 25, "Tuesday, Thursday");
        courseDatabase.addCourse(course1);
        courseDatabase.addCourse(course2);

        // Display available courses
        List<Course> availableCourses = courseDatabase.getAllCourses();
        System.out.println("Available Courses:");
        for (Course course : availableCourses) {
            System.out.println("Code: " + course.getCode() + ", Title: " + course.getTitle() +
                    ", Capacity: " + course.getCapacity() + ", Schedule: " + course.getSchedule());
        }

        // Student registration
        Student student = new Student(1001, "John Doe");
        student.registerCourse(course1);
        student.registerCourse(course2);

        // Display registered courses for the student
        List<Course> registeredCourses = student.getRegisteredCourses();
        System.out.println("\nRegistered Courses for " + student.getName() + ":");
        for (Course course : registeredCourses) {
            System.out.println("Code: " + course.getCode() + ", Title: " + course.getTitle());
        }

        // Student drops a course
        student.dropCourse(course1);

        // Display updated registered courses for the student
        System.out.println("\nUpdated Registered Courses for " + student.getName() + ":");
        for (Course course : registeredCourses) {
            System.out.println("Code: " + course.getCode() + ", Title: " + course.getTitle());
        }
    }
}





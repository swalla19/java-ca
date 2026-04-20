public class Main {
    public static void main(String[] args) {
        // Create a GraduateStudent object
        GraduateStudent graduateStudent = new GraduateStudent("Alice Johnson", 24, 101, 92.5, "Artificial Intelligence");

        // Display the complete student information
        System.out.println("Graduate Student Information:");
        graduateStudent.display();

        // Also demonstrate a regular Student
        System.out.println("\nRegular Student Information:");
        Student student = new Student("Bob Smith", 20, 102, 88.0);
        student.display();
    }
}
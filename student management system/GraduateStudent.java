public class GraduateStudent extends Student {
    private String specialization;

    public GraduateStudent(String name, int age, int rollNumber, double marks, String specialization) {
        super(name, age, rollNumber, marks);
        this.specialization = specialization;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }

    // Getters and setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
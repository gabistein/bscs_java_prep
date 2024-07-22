public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private double gpa;

    public Student(String id, String firstName, String lastName, String email, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
    }

    // Getters for all fields
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters for firstName, lastName, and email (not id and gpa)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id = " + id + ", First = " + firstName + ", Last = " + lastName + ", Email = " + email + ", GPA = " + String.format("%.1f", gpa);
    }
}

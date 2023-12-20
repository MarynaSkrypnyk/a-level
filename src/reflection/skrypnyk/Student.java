package src.reflection.skrypnyk;

public class Student {

    public int getExamScore() {
        return examScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public Student(String firstName, String lastName, int age, int examScore, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.examScore = examScore;
        this.dateOfBirth = dateOfBirth;
    }

    @ShowInfo
    private String firstName;
    @ShowInfo
    private String lastName;
    @ShowInfo
    private int age;
    @ShowInfo
    private int examScore;

    private int dateOfBirth;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", examScore=" + examScore +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    private void passExamSuccessfully() {
        this.examScore = 100;
    }
}

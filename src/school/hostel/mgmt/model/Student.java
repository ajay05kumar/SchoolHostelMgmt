package school.hostel.mgmt.model;

public class Student {
    private String name;
    private String rollNumber;
    private StudentClass studentClass;
    private FoodPreference foodPreference;

    public Student(){

    }

    public Student(String name, String rollNumber, StudentClass studentClass, FoodPreference foodPreference) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.studentClass = studentClass;
        this.foodPreference = foodPreference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public FoodPreference getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(FoodPreference foodPreference) {
        this.foodPreference = foodPreference;
    }
}

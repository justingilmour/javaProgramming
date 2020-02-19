package Week5;

public class Course {

    private String dept;
    private int course;
    private double credits;

    public Course(String dept, int course, double credits){
        this.course=course;
        this.credits=credits;
        this.dept=dept;
    }

    public String toString(){
        return dept + " " + course + " " + credits;
    }
}

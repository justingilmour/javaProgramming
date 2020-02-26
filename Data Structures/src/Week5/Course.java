package Week5;

import java.util.ArrayList;

public class Course {

    private String dept;
    private int course;
    private double credits;
    private ArrayList<Integer> courses = new ArrayList();

    public Course(String dept, int course, double credits){
        this.course=course;
        this.credits=credits;
        this.dept=dept;
    }

    public ArrayList<Integer> getCourses(int course) {
        if (courses.size() <= 4 && !courses.contains(course)) {
            courses.add(course);
        } return courses;
    }

    public ArrayList<Integer> removeCourses(int course){
        if (courses.contains(course)){
            courses.remove(course);
        } return courses;
    }

    public String toString(){
        String out = dept + " " + course + " " + credits + ". ";
        if (courses.size() < 3){
            out += "Your load is not full-time.";
        } else if (courses.size() == 0){
            out += "You are not classified as a student, you are taking no classes.";
        }
        return out;
    }
}

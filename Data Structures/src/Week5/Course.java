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
        this.course = course;
        if (courses.size() <= 4 && !courses.equals(courses)) {
            courses.add(course);
        } return courses;
    }

    public String toString(){
        return dept + " " + course + " " + credits;
    }
}

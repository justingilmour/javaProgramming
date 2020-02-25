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
//        if (courses.size() < 3)
        return dept + " " + course + " " + credits;
    }
}

package Week5;

import javax.print.attribute.standard.JobSheets;

public class StudentCourseTest {

    public static void main(String[] args) {
        Student stu1 = new Student("Josh", 500);
        Course course1 = new Course("CMSC",155, 4);
        System.out.println(stu1);
        Course course2 = new Course("Psych", 155, 4);
        Student stu2 = new Student("Justin");
        System.out.println(stu2);
        Student stu3 = new Student("Jordan");


    }
}

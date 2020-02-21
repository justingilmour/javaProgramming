package Week5;

import java.util.ArrayList;

public class Student {

    public static int nextId = 100;

    private String name;
    private int id;
<<<<<<< HEAD
=======

>>>>>>> df6508ab379764d7d8787fc80bc4b9a3059d5b07

    public Student(String name, int id){
        this.id=id;
        this.name=name;
    }

    public Student(String name){
        this(name, nextId++);
    }

    public void changeName(String name){
        String newName = "Jared";
        name = newName;
    }

//    public boolean compareID(int nextId){
//
//    }

    public String toString() {
        return name + " " + id;
    }
}

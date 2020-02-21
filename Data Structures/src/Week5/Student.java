package Week5;

public class Student {

    public static int nextId = 100;

    private String name;
    private int id;
    private 


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

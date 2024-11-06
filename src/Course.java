import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Course {
    String name;
    String teachersName;
    private List<Student> students;

    public Course(String name, String teachersName){
        if (name.length() <= 2) {
            System.out.println("Атын туура жазыныз");
            return;
        }
        this.name = name;
        this.teachersName = teachersName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void checkStudents(){
        for(Student student : students){
            if(student.age < 16){
                System.out.println(student.name + " окууга мүмкүнчүлүгү жок");
            }
        }
    }
    public void printStudents(){
        System.out.println("Students: " + "\n");
        for(Student student : students){
            System.out.println("Name: " + student.name + "\n" + "Age: "+ student.age + "\n" + "Size of words: " + student.countOfWords);
        }
    }
}

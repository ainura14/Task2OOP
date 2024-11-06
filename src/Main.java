//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aigerim", 19, 30);
        Student student2 = new Student("Aidana", 20, 25);

        Course course = new Course("ItCourse", "Nurmuhammed");
        if (course.name != null) {
            course.addStudent(student1);
            course.addStudent(student2);
            course.printStudents();
            course.checkStudents();
        }
    }
}
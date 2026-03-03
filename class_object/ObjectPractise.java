class Student {
    int id;
    String name;
    int marks;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class ObjectPractise {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.id = 101;
        student1.name = "Saman";
        student1.marks = 78;

        student1.display();
    }
}
package section1;

public class Section1Main {
    public static void main(String[] args) {

        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 16, 80);

        student1.studentInfo(student1);
        student1.studentInfo(student2);
    }
}

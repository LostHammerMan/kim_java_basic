package section1;

public class Student {

    public String name;
    public int age;
    private int result;

    public Student(String name, int age, int result) {
        this.name = name;
        this.age = age;
        this.result = result;
    }

    public void studentInfo(Student student){
        System.out.print("이름 : " + student.name);
        System.out.print(" 나이 : " + student.age);
        System.out.print(" 성적 : " + student.result);
        System.out.println();

    }
}

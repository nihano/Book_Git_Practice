package SelfPractice.day17_customClass;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setInfo("Amy", 'F', 19, "A123", 'A', true);
        System.out.println(s1);

        s1.study();

    }
}

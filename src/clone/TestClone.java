package clone;

import java.io.IOException;

public class TestClone {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("haha");
        stu.setAge(11);
        Grade grade = new Grade("A");
        stu.setGrade(grade);

        Student clone = null;
//        try {
//            clone = stu.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
        try {
            clone = stu.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(stu);
        clone.setGrade(new Grade("B"));
        System.out.println(clone);


    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher sujatha = new Teacher(1, "sujatha", 500);
        Teacher chitra = new Teacher(2, "chitra", 700);
        Teacher revathy = new Teacher(3, "revathy", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(sujatha);
        teacherList.add(chitra);
        teacherList.add(revathy);


        Student snega = new Student(1, "snega", 4);
        Student deepika = new Student(2, "deepika", 12);
        Student kaviya = new Student(3, "kaviya", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(snega);
        studentList.add(deepika);
        studentList.add(kaviya);


        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "megan", 900);

        ghs.addTeacher(megan);


        snega.payFees(5000);
        kaviya.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        sujatha.receiveSalary(sujatha.getSalary());
        System.out.println("GHS has spent for salary to " + sujatha.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        revathy.receiveSalary(revathy.getSalary());
        System.out.println("GHS has spent for salary to " + revathy.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(kaviya);

        chitra.receiveSalary(chitra.getSalary());

        System.out.println(chitra);


    }
}
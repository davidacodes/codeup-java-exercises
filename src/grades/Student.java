package grades;


import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();;
    }

    public String getName() {
        return name;
    }

    public void addGrades(int nums) {
        grades.add(nums);
    }

    public int getGradeAverage() {
        int nums = 0;
        for(int grade : grades) {
            nums += grade;
        }
        return nums / grades.size();

    }

    public static void main(String[] args) {
        Student student = new Student("David");

        System.out.println();
        System.out.println(student.grades.size());

        student.addGrades(90);
        student.addGrades(85);
        student.addGrades(70);

        System.out.println(student.getGradeAverage());
    }
}

package StreamExample;

public class Student {
    private String name;
    private int age;
    private double gradePointAverage;

    public Student(String name, int age, double gradePointAverage) {
        this.name = name;
        this.age = age;
        this.gradePointAverage = gradePointAverage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradePointAverage=" + gradePointAverage +
                '}';
    }
}

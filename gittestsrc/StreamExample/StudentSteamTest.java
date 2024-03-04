package StreamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentSteamTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3.5));
        students.add(new Student("Bob", 21, 3.8));
        students.add(new Student("Charlie", 19, 3.2));
        students.add(new Student("David", 22, 3.9));
        students.add(new Student("Eve", 20, 3.7));

        // 이곳에 Stream API를 사용하여 문제를 해결하는 코드를 작성합니다.
        // todo
        // 문제: 학생 객체 리스트에서 특정 조건을 만족하는 학생들을 필터링하고, 그 결과를 정렬하여 출력하는 프로그램을 작성하십시오.
        List<Student> filteredAndSortedStudents = students.stream().filter(student -> student.getGradePointAverage() >= 3.5)
        .sorted(Comparator.comparingInt(Student::getAge))
        .collect(Collectors.toList());

        System.out.println("Filtered and sorted students:");
        filteredAndSortedStudents.forEach(System.out::println);

        System.out.println("-------------------");

        List<Student> filteredAndSortedStudent1 = students.stream().filter(x -> x.getAge() == 20)
          .collect(Collectors.toList());
          filteredAndSortedStudent1.forEach(System.out::println);
    }
}

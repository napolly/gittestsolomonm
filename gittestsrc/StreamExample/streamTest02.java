package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamTest02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 4, 3, 6, 2, 5, 4, 7, 8, 1);

        // 이곳에 Stream API를 사용하여 문제를 해결하는 코드를 작성합니다.
        //문제: 주어진 정수 리스트에서 중복된 숫자를 제거하고, 제곱한 결과를 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
        List<Integer> result = numbers.stream().distinct()
        .map(num -> num * num)
        .sorted()
        .collect(Collectors.toList());

        result.forEach(System.out::println);

        List<Integer> result2 = result.stream().filter(x -> x%2 ==1)
        .collect(Collectors.toList());

        result2.forEach(System.out::println);
    }
}

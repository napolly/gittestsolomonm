package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby", "Go");

        // 이곳에 Stream API를 사용하여 문제를 해결하는 코드를 작성합니다.
        // 문제: 주어진 문자열 리스트에서 각 문자열의 길이가 홀수인 문자열들만 필터링하고, 이를 알파벳 역순으로 정렬하여 출력하는 프로그램을 작성하세요.
        List<String> findresult = strings.stream().filter(string -> string.length() %2 == 1)
        .sorted((str1, str2) -> str2.compareTo(str1))
        .collect(Collectors.toList());

        findresult.forEach(System.out::println);
    }
}
